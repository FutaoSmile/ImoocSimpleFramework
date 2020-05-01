package com.futao.pattern.listener.impl;

import com.futao.pattern.listener.EventListener;
import com.futao.pattern.listener.event.UC;

/**
 * @author futao
 * @date 2020/5/1
 */
public class ClickListener implements EventListener<UC> {
    @Override
    public void listener(UC uc) {
        System.out.println("ClickListener获取到" + uc);
    }
}
