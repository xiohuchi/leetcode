package com.example.designpattern.observer.classs;

import com.example.designpattern.observer.interfaces.Observer;
import com.example.designpattern.observer.interfaces.Subject;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by jingbin on 2016/10/21.
 * 模拟第一个使用者
 */
@Slf4j
public class ObserverUser1 implements Observer {

    public ObserverUser1(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        log.info("-----ObserverUser1 得到 3D 号码:" + msg + ", 我要记下来。 ");
    }
}
