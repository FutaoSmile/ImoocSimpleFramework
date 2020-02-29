package com.futao.pattern.factory.abstractf;

import com.futao.pattern.factory.entity.keyboard.Keyboard;
import com.futao.pattern.factory.entity.mouse.Mouse;

/**
 * 抽象工厂模式---制造套装
 *
 * @author futao
 * @date 2020/2/27.
 */
public interface ComputerFactory {
    Mouse createMouse();

    Keyboard createKeyboard();

    static void main(String[] args) {
        ComputerFactory computerFactory = new DellComputer();
        computerFactory.createMouse().click();
        computerFactory.createKeyboard().press();

        computerFactory = new HpComputer();
        computerFactory.createMouse().click();
        computerFactory.createKeyboard().press();
    }
}
