package com.example.designpattern.factory.jdgc;


import lombok.extern.slf4j.Slf4j;

/**
 * Created by jingbin on 2016/10/22.
 */
@Slf4j
public abstract class RoujiaMo {

    protected String name;

    /**
     * 准备工作
     */
    public void prepare() {
        log.info("---RoujiaMo:" + name + ": 揉面-剁肉-完成准备工作");
    }

    /**
     * 秘制设备--烘烤2分钟
     */
    public void fire() {
        log.info("---RoujiaMo:" + name + ": 肉夹馍-专用设备-烘烤");
    }

    /**
     * 使用你们的专用袋-包装
     */
    public void pack() {
        log.info("---RoujiaMo:" + name + ": 肉夹馍-专用袋-包装---end");
    }
}
