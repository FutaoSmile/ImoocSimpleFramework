package com.futao.pattern.factory.entity.keyboard;

import lombok.extern.slf4j.Slf4j;

/**
 * @author futao
 * @date 2020/2/27.
 */
@Slf4j
public class DellKeyboard implements Keyboard {
    @Override
    public void press() {
        log.info("戴尔键盘咔哒咔哒...");
    }
}
