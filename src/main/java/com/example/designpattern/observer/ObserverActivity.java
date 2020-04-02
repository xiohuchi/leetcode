package com.example.designpattern.observer;

import com.example.designpattern.observer.classs.ObjectFor3D;
import com.example.designpattern.observer.classs.ObserverUser1;
import com.example.designpattern.observer.classs.ObserverUser2;
import com.example.designpattern.observer.javautil.Observer1;
import com.example.designpattern.observer.javautil.SubjectFor3d;
import com.example.designpattern.observer.javautil.SubjectForSSQ;
import lombok.extern.slf4j.Slf4j;

/**
 * 可以看出，使用Java内置的类实现观察者模式，代码非常简洁，
 * 对了addObserver,removeObserver,notifyObservers都已经为我们实现了，
 * 所有可以看出Observable（主题）是一个类，而不是一个接口，
 * 基本上书上都对于Java的如此设计抱有反面的态度，觉得Java内置的观察者模式，
 * 违法了面向接口编程这个原则，但是如果转念想一想，
 * 的确你拿一个主题在这写观察者模式（我们自己的实现），
 * 接口的思想很好，但是如果现在继续添加很多个主题，
 * 每个主题的ddObserver,removeObserver,notifyObservers代码基本都是相同的吧，
 * 接口是无法实现代码复用的，而且也没有办法使用组合的模式实现这三个方法的复用，
 * 所以我觉得这里把这三个方法在类中实现是合理的。
 */
@Slf4j
public class ObserverActivity {


    private static ObjectFor3D objectFor3D;
    private static ObserverUser1 observerUser1;
    private static ObserverUser2 observerUser2;

    public static void main(String[] args) {
        onClick(1);
        onClick(2);
    }


    public static void onClick(int type) {
        switch (type) {
            case 1:// 自己实现的3D服务号
                // 创建服务号
                objectFor3D = new ObjectFor3D();

                // 创建两个订阅者
                observerUser1 = new ObserverUser1(objectFor3D);
                observerUser2 = new ObserverUser2(objectFor3D);

                // 两个观察者,发送两条信息
                objectFor3D.setMsg("201610121 的3D号为:127");
                objectFor3D.setMsg("20161022 的3D号为:000");
                break;
            case 2://使用Java内置的类实现观察者模式
                loadSystemObserver();
                break;
            default:
                break;
        }
    }

    /**
     * 系统的观察者接口
     */
    private static void loadSystemObserver() {
        // 创建2个服务号
        SubjectFor3d subjectFor3d = new SubjectFor3d();//3d
        SubjectForSSQ subjectForSSQ = new SubjectForSSQ();//双色球

        // 创建订阅者
        Observer1 observer1 = new Observer1();
        observer1.registerSubject(subjectFor3d);
        observer1.registerSubject(subjectForSSQ);

        // 发送信息
        subjectFor3d.setMsg("hello 3d'nums : 110 ");
        subjectForSSQ.setMsg("ssq'nums : 12,13,31,5,4,3 15");
    }
}
