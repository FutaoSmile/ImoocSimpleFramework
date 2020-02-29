package com.futao.pattern.factory.method;

import com.futao.pattern.factory.entity.mouse.HpMouse;
import com.futao.pattern.factory.entity.mouse.Mouse;

/**
 * 真正的创建惠普鼠标的工厂🏭
 *
 * @author futao
 * @date 2020/2/27.
 */
public class HpMouseFactory implements MouseFactory {

    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }
}
