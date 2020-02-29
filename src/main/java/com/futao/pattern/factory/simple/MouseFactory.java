package com.futao.pattern.factory.simple;

import com.futao.pattern.factory.entity.mouse.DellMouse;
import com.futao.pattern.factory.entity.mouse.HpMouse;
import com.futao.pattern.factory.entity.mouse.Mouse;

/**
 * 简单工厂🏭模式
 * </br>
 * 适用于1.创建的对象类型比较少的场景：case分支比较少
 * 2.客户端不关心创建对象的过程
 *
 * @author futao
 * @date 2020/2/27.
 */
public class MouseFactory {

    public static Mouse createMouse(int type) {
        switch (type) {
            case 1:
                return new DellMouse();
            case 2:
                return new HpMouse();
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        MouseFactory.createMouse(1).click();
        MouseFactory.createMouse(2).click();
    }
}
