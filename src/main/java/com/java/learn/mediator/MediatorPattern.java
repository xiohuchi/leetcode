package com.java.learn.mediator;

/**
 * 中介者模式
 *
 * @author YangBin
 * @date 2020年04月02日
 */
public class MediatorPattern {

    public static void main(String[] args) {
        Mediator md = new ConcreteMediator();
        Colleague c1, c2;
        c1 = new ConcreteColleague1();
        c2 = new ConcreteColleague2();
        md.register(c1);
        md.register(c2);
        c1.send();
        System.out.println("-------------");
        c2.send();
    }
}
