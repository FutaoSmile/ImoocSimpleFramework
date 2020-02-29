package com.futao.pattern.factory.abstractf;

import com.futao.pattern.factory.entity.keyboard.HpKeyboard;
import com.futao.pattern.factory.entity.keyboard.Keyboard;
import com.futao.pattern.factory.entity.mouse.HpMouse;
import com.futao.pattern.factory.entity.mouse.Mouse;

/**
 * @author futao
 * @date 2020/2/27.
 */
public class HpComputer implements ComputerFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new HpKeyboard();
    }
}
