package domain;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Poker extends JLabel implements MouseListener {
    //牌的名字
    private String name;
    //牌显示正面还是反面
    private boolean up;
    //是否可点击
    private boolean canClick = false;
    //当前状态，是否已经被点击
    private boolean clicked = false;

    public Poker(String name, boolean up) {
        this.name= name;
        this.up = up;
        //初始化牌
        initPoker();
    }

    private void initPoker() {
        if (this.up){
            //正面
            this.turnFront();
        }else{
            //反面
            this.turnRear();
        }
        this.setSize(71,96);
        this.setVisible(true);
        this.addMouseListener(this);
    }

    //显示正面
    public void turnFront() {

    }
    //显示反面
    public void turnRear() {
    }
    //点击
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


    //自己练习
}
