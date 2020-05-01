package com.futao.pattern.listener;

import java.util.LinkedList;
import java.util.List;

/**
 * 可以根据监听的事件的类型来给监听器分组，再根据不同的事件的类型来给指定的监听器发送通知，而不是所有的监听器发送通知
 *`
 * @author futao
 * @date 2020/5/1
 */
public class EventControl {
    private List<EventListener> eventListeners = new LinkedList<>();

    public void addListener(EventListener eventListener) {
        eventListeners.add(eventListener);
    }

    public void pushEvent(Object event) {
        eventListeners.forEach(eventListener -> {
            eventListener.listener(event);
        });
    }
}
