package com.futao.pattern.factory.method;

import com.futao.pattern.factory.entity.mouse.Mouse;

/**
 * 工厂方法模式：与简单工厂的区别是：将创建对象的工作下沉，有多少种类型需要创建，就需要有多少个工厂
 * <p>
 * 缺点：需要大量的工厂方法
 *
 * @author futao
 * @date 2020/2/27.
 */
public interface MouseFactory {

    Mouse createMouse();


    static void main(String[] args) {
        MouseFactory factory = new DellMouseFactory();
        factory.createMouse().click();

        factory = new HpMouseFactory();
        factory.createMouse().click();
    }
}
