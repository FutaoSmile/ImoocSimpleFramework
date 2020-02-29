package com.futao.pattern.factory.abstractf;

import com.futao.pattern.factory.entity.keyboard.DellKeyboard;
import com.futao.pattern.factory.entity.keyboard.Keyboard;
import com.futao.pattern.factory.entity.mouse.DellMouse;
import com.futao.pattern.factory.entity.mouse.Mouse;

/**
 * @author futao
 * @date 2020/2/27.
 */
public class DellComputer implements ComputerFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }
}
