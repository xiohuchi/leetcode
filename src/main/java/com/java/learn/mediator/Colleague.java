package com.java.learn.mediator;

/**
 * 抽象同事类
 *
 * @author YangBin
 * @date 2020年04月02日
 */
abstract class Colleague {
    protected Mediator mediator;

    public void setMedium(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();

    public abstract void send();
}
