package com.pintu.ui;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.xml.crypto.Data;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {

    int[][]data=new int[4][4];
    int x=0;
    int y=0;
    String path="image\\girl\\girl2\\";
 //胜利数组
    int[][]win={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };
    //初始化步数
    int step=0;
    JMenuItem againItem=new JMenuItem("重新游戏");
    JMenuItem againReginItem=new JMenuItem("重新登录");
    JMenuItem exitItem=new JMenuItem("关闭游戏");

    JMenuItem toItem=new JMenuItem("公众号");

    public GameJFrame(){
        //界面初始化
        initGFrame();
        //菜单初始化
        initGmenuBar();
        //打乱数据
        initData();
        //添加图片
        initImage();
        this.setVisible(true);
    }

    private void initData() {
        int[] Arr={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Random r=new Random();
        for (int i = 0; i < Arr.length; i++) {
            int index = r.nextInt(Arr.length);
          int temp=Arr[i];
          Arr[i]=Arr[index];
            Arr[index]=temp;
        }
        for (int i = 0; i < Arr.length; i++) {
            if(Arr[i]==0){
                x=i/4;
                y=i%4;
            }
                data[i/4][i%4]=Arr[i];
        }
    }

    private void initImage() {

        //清空图片
        this.getContentPane().removeAll();
        //判断胜利
       if(victory()){
           JLabel winJ=new JLabel(new ImageIcon("image\\win.png"));
           winJ.setBounds(203,283,197,73);
           this.getContentPane().add(winJ);
       }
       //添加步数文字
       JLabel stepCount=new JLabel("步数: "+step);
       stepCount.setBounds(50,30,100,20);
       this.getContentPane().add(stepCount);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num=data[i][j];
                JLabel j1 =new JLabel(new ImageIcon(path+num+".jpg"));
                //指定位置
                j1.setBounds(105*j+83,105*i+134,105,105);
                //加边框
                j1.setBorder(new BevelBorder(1));
                //添加
                this.getContentPane().add(j1);
            }
        }
        //添加背景图片
        JLabel background=new JLabel(new ImageIcon("image\\background.png"));
        background.setBounds(40,40,508,560);
        this.getContentPane().add(background);
       //刷新界面
        this.getContentPane().repaint();
    }

    private void initGmenuBar () {
        JMenuBar jMenuBar=new JMenuBar();
        //功能 关于我们
        JMenu functionJMenu=new JMenu("功能");
        JMenu aboutJMenu=new JMenu("关于我们");
        JMenu reJMenu=new JMenu("更换图片");

        //重新游戏 重新登录 关闭游戏

        //按键绑定事件
        againItem.addActionListener(this);
        againReginItem.addActionListener(this);
        exitItem.addActionListener(this);
        toItem.addActionListener(this);

        //把条目添加到功能区
        functionJMenu.add(againItem);
        functionJMenu.add(againReginItem);
        functionJMenu.add(exitItem);
        aboutJMenu.add(toItem);
        //
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);
        //
        this.setJMenuBar(jMenuBar);
    }

    private void initGFrame() {
        this.setSize(603,680);
        //标题命名
        this.setTitle("拼图单机版 v1.0");
        //置顶
        this.setAlwaysOnTop(true);
        //居中
        this.setLocationRelativeTo(null);
        //关闭游戏
        this.setDefaultCloseOperation(3);
        //取消默认居中放置,图片才能按照x,y坐标
        this.setLayout(null);
        //添加监听
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if(code==65){
            this.getContentPane().removeAll();
            JLabel jLabel=new JLabel(new ImageIcon(path+"all.jpg"));
            jLabel.setBounds(83,134,420,420);
            this.getContentPane().add(jLabel);

            JLabel background=new JLabel(new ImageIcon("image\\background.png"));
            background.setBounds(40,40,508,560);
            this.getContentPane().add(background);
            this.getContentPane().repaint();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (victory()){
            //结束方法
            return;
        }
        int code = e.getKeyCode();
        if(code==37){
            //左移动
            if(y==3){
                return;
            }
            data[x][y]=data[x][y+1];
            data[x][y+1]=0;
            y++;
            //计数
            step++;
            initImage();
        }else if(code==38){
            //上移动
            if(x==3){
               return;
            }
            data[x][y]=data[x+1][y];
            data[x+1][y]=0;
            x++;
            step++;
            initImage();
        }else if(code==39){
            //右
            if(y==0){
                return;
            }
            data[x][y]=data[x][y-1];
            data[x][y-1]=0;
            y--;
            step++;
            initImage();
        }else if(code==40){
            //下移动
            if(x==0){
                return;
            }
            data[x][y]=data[x-1][y];
            data[x-1][y]=0;
            x--;
            step++;
            initImage();
        }else if(code==65){
            initImage();
        }else if(code==87){
            data=new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,0}
            };
            initImage();
        }
    }

    //判断胜利
    public boolean victory(){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
               if(data[i][j]!=win[i][j]){
                   return false;
               }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj==againItem){
            System.out.println("重新游戏");
            //打乱数据
            //步数清零
            initData();
            step=0;
            //加载图片
            initImage();

        }else if(obj==againReginItem){
            System.out.println("重新登录");
            //关闭游戏界面
            this.setVisible(false);
            //打开登陆界面
            new LoginJFrame();
        }else if (obj==exitItem){
            System.out.println("关闭游戏");
            System.exit(0);
        }else if(obj==toItem){
            System.out.println("公众号");
            JDialog jDialog=new JDialog();
            JLabel jLabel=new JLabel(new ImageIcon("image\\girl\\girl1\\all.jpg"));
            jLabel.setBounds(0,0,420,420);
            jDialog.getContentPane().add(jLabel);
            jDialog.setSize(500,500);
            //弹框置顶
            jDialog.setAlwaysOnTop(true);
            //弹框居中
            jDialog.setLocationRelativeTo(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        }
    }
}
