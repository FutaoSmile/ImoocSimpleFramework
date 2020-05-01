package com.futao.pattern.listener;

/**
 * @author futao
 * @date 2020/5/1
 */
public interface EventListener<E> {
    void listener(E e);
}
