package com.futao.framework.util;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

/**
 * @author futao
 * @date 2020/2/28.
 */
@Slf4j
public class ClassUtil {

    public static final String FILE = "file";
    public static final String CLASS_STR = "class";


    /**
     * 获取指定包下的类
     *
     * @param pkg 包名
     * @return
     */
    public static Set<Class<?>> extractPackageClass(String pkg) {
        URL url = ClassUtil.getCurrentClasLoader().getResource(pkg.replace(".", "/"));
        if (url == null) {
            log.info("当前包[{}]下无资源", pkg);
            return null;
        }
        Set<Class<?>> classSet = new HashSet<>(0);
        //文件协议
        String protocol = url.getProtocol();
        if (FILE.equalsIgnoreCase(protocol)) {
            classSet = new HashSet<>();
            //pkg对应的文件夹绝对路径
            File pkgDir = new File(url.getPath());
            log.debug("pkg对应的文件夹的绝对路径为:{}", url.getPath());
            ClassUtil.extractClassFile(classSet, pkgDir, pkg);
        }

        System.out.println(classSet.toString());
        return classSet;
    }


    private static void extractClassFile(Set<Class<?>> classSet, File pkgDir, String pkg) {
        String path = pkgDir.getPath();
        if (pkgDir.isDirectory()) {
            File[] files = pkgDir.listFiles();
            if (files != null && files.length > 0) {
                for (File childFile : files) {
                    extractClassFile(classSet, childFile, pkg);
                }
            }
            //是文件夹
        } else if (pkgDir.isFile()) {
            //是文件
            log.debug("识别文件:{}", path);
            if (CLASS_STR.equalsIgnoreCase(path.substring(path.lastIndexOf(".") + 1))) {
                try {
                    //返回相对路径  pck/class.class
                    String pkgAndClassSuffix = path.substring(path.indexOf(pkg.replace(".", "/")));
                    //将`/`替换成`.`的形式并且返回类的包路径和类名
                    String pkgAndClassName = pkgAndClassSuffix.substring(0, pkgAndClassSuffix.lastIndexOf(".")).replace(File.separator, ".");
                    classSet.add(Class.forName(pkgAndClassName));
                } catch (ClassNotFoundException e) {
                    log.error("通过类路径[{}]反射获取class失败", path, e);
                }
            }
        } else {
            //无法识别
            log.warn("无法识别文件[{}]类型", path);
        }
    }

    /**
     * 从当前线程中获取ClassLoader
     *
     * @return
     */
    public static ClassLoader getCurrentClasLoader() {
        return Thread.currentThread().getContextClassLoader();
    }

    public static void main(String[] args) {
        ClassUtil.extractPackageClass("com.futao");
    }

}
