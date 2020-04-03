package com.example.designpattern.factory;

import com.example.designpattern.factory.cxgc.XianRoujiaMoTeSeStore;
import com.example.designpattern.factory.cxgc.XianSimpleRoujiaMoTeSeFactory;
import com.example.designpattern.factory.gcff.XianRoujiaMoStore;
import com.example.designpattern.factory.gcff.XianSimpleRoujiaMoFactory;
import com.example.designpattern.factory.jdgc.RoujiaMoStore;
import com.example.designpattern.factory.jdgc.SimpleRoujiaMoFactory;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by jingbin on 2016/10/22.
 * <p>
 * 今天继续设计模式之旅，给大家带来工厂模式，简单列一下这个模式的家族：
 * 1、静态工厂模式
 * 2、简单工厂模式
 * 3、工厂方法模式
 * 4、抽象工厂模式
 * <p>
 * <p>
 * 1、静态工厂模式
 * 这个最常见了，项目中的辅助类，TextUtil.isEmpty等，类+静态方法。下面开始详细介绍：略
 */
@Slf4j
public class FactoryActivity {

    public static void main(String[] args) {
        log.info("1.静态工厂模式");
        onClick(1);
        log.info("2.简单工厂模式");
        onClick(2);
        log.info("3.工厂方法模式");
        onClick(3);
        log.info("4.抽象工厂模式");
        onClick(4);
    }

    public static void onClick(int type) {
        switch (type) {
            case 1:// 1.静态工厂模式
                log.info("TextUtil.isEmpty等，类+静态方法.");
                break;
            case 2: // 2.简单工厂模式 (店里卖肉夹馍)
                // 通过专门定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类。
                RoujiaMoStore roujiaMoStore = new RoujiaMoStore(new SimpleRoujiaMoFactory());
                roujiaMoStore.sellRoujiaMo("Suan");
                roujiaMoStore.sellRoujiaMo("Tian");
                roujiaMoStore.sellRoujiaMo("La");
                break;
            case 3: // 3.工厂方法模式 (开分店)
                // 定义：定义一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法模式把类实例化的过程推迟到子类。
                XianRoujiaMoStore xianRoujiaMoStore = new XianRoujiaMoStore(new XianSimpleRoujiaMoFactory());// 分店简单工厂
                xianRoujiaMoStore.sellRoujiaMo("Suan");
                xianRoujiaMoStore.sellRoujiaMo("Tian");
                xianRoujiaMoStore.sellRoujiaMo("La");
                break;
            case 4:// 4.抽象工厂模式 (使用官方提供的原料)
                // 定义：提供一个接口，用于创建相关的或依赖对象的家族，而不需要明确指定具体类。
                XianRoujiaMoTeSeStore xianRoujiaMoTeSeStore = new XianRoujiaMoTeSeStore(new XianSimpleRoujiaMoTeSeFactory());
                xianRoujiaMoTeSeStore.sellRoujiaMo("Suan");
                break;
            default:
                break;
        }
    }
}
