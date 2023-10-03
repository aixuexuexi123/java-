package com.pintu.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    public LoginJFrame(){
        this.setSize(488,430);
        //标题命名
        this.setTitle("拼图登录");
        //置顶
        this.setAlwaysOnTop(true);
        //居中
        this.setLocationRelativeTo(null);
        //关闭游戏
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
    }
}
