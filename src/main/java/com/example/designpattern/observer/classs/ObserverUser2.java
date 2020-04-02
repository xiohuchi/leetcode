package com.example.designpattern.observer.classs;

import com.example.designpattern.observer.interfaces.Observer;
import com.example.designpattern.observer.interfaces.Subject;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by jingbin on 2016/10/21.
 * 模拟第二个使用者
 */
@Slf4j
public class ObserverUser2 implements Observer {

    public ObserverUser2(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        log.info("-----ObserverUser2 得到 3D 号码:" + msg + ", 我要告诉舍友们。");
//        Toast.makeText(PatternApplication.getInstance(), "-----ObserverUser2 得到 3D 号码:" + msg, Toast.LENGTH_SHORT).show();
    }
}
