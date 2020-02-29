package com.futao.pattern.factory.entity.mouse;

import lombok.extern.slf4j.Slf4j;

/**
 * @author futao
 * @date 2020/2/27.
 */
@Slf4j
public class DellMouse implements Mouse {
    @Override
    public void click() {
        log.info("戴尔鼠标滴滴滴...");
    }
}
