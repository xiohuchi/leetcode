package com.java;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author YangBin
 * @date 2020年04月09日
 */
@Data
public class ClassBean {
    public ClassBean(String type, BigDecimal val) {
        this.type = type;
        this.val = val;
    }

    private String type;
    private BigDecimal val;
}
