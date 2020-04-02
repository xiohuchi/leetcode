package com.java.learn.proxy;

import javax.swing.*;
import java.awt.*;

/**
 * 真实主题：婺源特产
 *
 * @author YangBin
 * @date 2020年04月02日
 */
public class WySpecialty extends JFrame implements Specialty {
    private static final long serialVersionUID = 1L;

    public WySpecialty() {
        super("杨滨测试");
        this.setLayout(new GridLayout(1, 1));
        JLabel l1 = new JLabel(new ImageIcon("C:\\Users\\YangBin\\Desktop\\640 (3).gif"));
        this.add(l1);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void display() {
        this.setVisible(true);
    }
}

