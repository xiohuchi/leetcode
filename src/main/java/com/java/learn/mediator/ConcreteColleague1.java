package com.java.learn.mediator;

/**
 * 具体同事类
 *
 * @author YangBin
 * @date 2020年04月02日
 */
public class ConcreteColleague1 extends Colleague {
    public void receive() {
        System.out.println("具体同事类1收到请求。");
    }

    public void send() {
        System.out.println("具体同事类1发出请求。");
        mediator.relay(this); //请中介者转发
    }
}
