package domain;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Objects;

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

    public Poker() {
    }

    public Poker(String name, boolean up, boolean canClick, boolean clicked) {
        this.name = name;
        this.up = up;
        this.canClick = canClick;
        this.clicked = clicked;
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
        this.setIcon(new ImageIcon("PokerGame\\image\\poker\\" + name + ".png"));
        this.up=true;
    }
    //显示反面
    public void turnRear() {
        this.setIcon(new ImageIcon("PokerGame\\image\\poker\\rear.png"));
        this.up=false;
    }
    //点击
    @Override
    public void mouseClicked(MouseEvent e) {
        if(canClick){
            Point from = this.getLocation();
            int step;
            if (clicked){
                step = 20;
            }else {
                step = -20;
            }
            clicked = !clicked;
            from.y += step;
            this.setLocation(from);
        }
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

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return up
     */
    public boolean isUp() {
        return up;
    }

    /**
     * 设置
     * @param up
     */
    public void setUp(boolean up) {
        this.up = up;
    }

    /**
     * 获取
     * @return canClick
     */
    public boolean isCanClick() {
        return canClick;
    }

    /**
     * 设置
     * @param canClick
     */
    public void setCanClick(boolean canClick) {
        this.canClick = canClick;
    }

    /**
     * 获取
     * @return clicked
     */
    public boolean isClicked() {
        return clicked;
    }

    /**
     * 设置
     * @param clicked
     */
    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Poker)) return false;
        Poker poker = (Poker) o;
        return up == poker.up && canClick == poker.canClick && clicked == poker.clicked && Objects.equals(name, poker.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, up, canClick, clicked);
    }

    public String toString() {
        //return Integer.toString(this.hashCode());
        return "Poker{name = " + name + ", up = " + up + ", canClick = " + canClick + ", clicked = " + clicked + "}";
    }


    //自己练习
}
