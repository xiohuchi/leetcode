package com.example.designpattern.factory.cxgc;


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
    public void prepare(RoujiaMoYLFactory roujiaMoYLFactory) {
        Meet meet = roujiaMoYLFactory.creatMeet();
        YuanLiao yuanLiao = roujiaMoYLFactory.creatYuanLiao();

        log.info("---RoujiaMo:" + "使用官方的原料 ---" + name + ": 揉面-剁肉-完成准备工作 yuanLiao:" + meet + "yuanLiao:" + yuanLiao);
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
