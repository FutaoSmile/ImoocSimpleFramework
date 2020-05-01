package com.futao.pattern.listener;

import com.futao.pattern.listener.event.UC;
import com.futao.pattern.listener.impl.ClickListener;
import com.futao.pattern.listener.impl.DoubleClickListener;

/**
 * @author futao
 * @date 2020/5/1
 */
public class Main {
    public static void main(String[] args) {
        EventControl eventControl = new EventControl();
        eventControl.addListener(new ClickListener());
        eventControl.addListener(new DoubleClickListener());

        UC event = new UC();
        event.setX(999D);
        event.setY(9898D);
        eventControl.pushEvent(event);

    }
}
