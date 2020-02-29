package com.futao.pattern.factory.method;

import com.futao.pattern.factory.entity.mouse.DellMouse;
import com.futao.pattern.factory.entity.mouse.Mouse;

/**
 * 正常创建戴尔鼠标的工厂🏭
 *
 * @author futao
 * @date 2020/2/27.
 */
public class DellMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}
