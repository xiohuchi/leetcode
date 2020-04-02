package com.java.learn.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体中介者
 *
 * @author YangBin
 * @date 2020年04月02日
 */
public class ConcreteMediator extends Mediator {
    private List<Colleague> colleagues = new ArrayList<>();

    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMedium(this);
        }
    }

    public void relay(Colleague cl) {
        for (Colleague ob : colleagues) {
            if (!ob.equals(cl)) {
                ((Colleague) ob).receive();
            }
        }
    }
}
