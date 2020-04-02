package com.example.designpattern.factory.cxgc;


/**
 * Created by jingbin on 2016/10/24.
 * 西安肉夹馍店   让分店自己去卖自己口味的肉夹馍
 */

public class XianRoujiaMoTeSeStore extends RoujiaMoStore {

    private XianSimpleRoujiaMoTeSeFactory factory;

    public XianRoujiaMoTeSeStore(XianSimpleRoujiaMoTeSeFactory factory) {
        this.factory = factory;
    }

    @Override
    public void sellRoujiaMo(String type) {
        RoujiaMo roujiaMo = factory.creatRoujiaMo(type);
        roujiaMo.prepare(new XianRoujiaMoYLFoctory());
        roujiaMo.fire();
        roujiaMo.pack();
    }
}
