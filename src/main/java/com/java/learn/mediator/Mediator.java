package com.java.learn.mediator;

/**
 * 抽象中介者
 *
 * @author YangBin
 * @date 2020年04月02日
 */
abstract class Mediator {
    public abstract void register(Colleague colleague);

    public abstract void relay(Colleague cl); //转发
}
