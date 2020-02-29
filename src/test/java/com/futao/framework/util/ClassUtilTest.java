package com.futao.framework.util;

import org.junit.jupiter.api.DisplayName;

/**
 * @author futao
 * @date 2020/2/28.
 */
class ClassUtilTest {

    @DisplayName("测试根据包路径加载类资源")
    @org.junit.jupiter.api.Test
    public void extractPackageClass() {
        ClassUtil.extractPackageClass("com.futao.imooc");
    }
}