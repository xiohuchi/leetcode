package com.java.learn.proxy;

/**
 * @author YangBin
 * @date 2020年04月02日
 */
public class WySpecialtyProxy {
    public static void main(String[] args) {
        SgProxy proxy = new SgProxy();
        proxy.display();
    }
}

//代理：代理
class SgProxy implements Specialty {
    private WySpecialty realSubject = new WySpecialty();

    public void display() {
        preRequest();
        realSubject.display();
        postRequest();
    }

    public void preRequest() {
        System.out.println("代理杨滨测试开始。");
    }

    public void postRequest() {
        System.out.println("代理杨滨测试结束。");
    }
}
