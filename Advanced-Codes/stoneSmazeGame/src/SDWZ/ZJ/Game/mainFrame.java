package SDWZ.ZJ.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class mainFrame extends JFrame implements KeyListener {
    //继承了JFrame，所以JFrame的方法mainFrame都有，可以直接调用，super可以省略。
    private int column, row;//0.png（空位坐标）i-row j-column
    private int count;//统计步数
    private int[][] data = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    private final int[][] victory = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    //构造方法，new对象时初始化数据。
    public mainFrame() {
        init();//设置窗口
        initData();//打乱数字顺序
        printView();//加载图片
        this.addKeyListener(this);//移动业务
        /*
        this.addKeyListener(this)：
        mainJFrame继承了JFrame类和KeyListener接口
        所以mainJFrame分别是JFrame类和KeyListener接口的窗口类和实现类
        所以使用this调用JFrame的addKeyListener方法，将自己当作KeyListener的实现类（this）传参过去
        添加指定的按键侦听器，以接收发自此组件（mainFrame继承了JFrame，所以它就是窗口组件）的按键事件。
        如果 l 为 null，则不会抛出异常并且不执行动作。
         */
        super.setVisible(true);//最后显示窗口
    }

    //重新游戏
    private void newGame(JButton button) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count = 0;
                initData();
                printView();
            }
        });
    }

    //界面初始化
    private void init() {
        super.setTitle("石头迷阵单机版v1.0");
        super.setSize(514, 595);
        super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        super.setAlwaysOnTop(true);
        super.setLocationRelativeTo(null);
        super.setLayout(null);
    }

    //打乱数字顺序、找到空白坐标、统计步数
    private void initData() {
        int temp;
        Random random = new Random();

        //打乱数字顺序
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                int indexX = random.nextInt(4);
                int indexY = random.nextInt(4);
                temp = data[indexX][indexY];
                data[indexX][indexY] = data[i][j];
                data[i][j] = temp;
            }
        }

        //找到空白坐标
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == 0) {
                    row = i;
                    column = j;
                }
            }
        }
    }

    //加载界面（加载图片）
    private void printView() {
        super.getContentPane().removeAll();//移除桌面所有组件

        //胜利后加载胜利图片
        if (victory() == true){
            JLabel victory = new JLabel(new ImageIcon("stoneSmazeGame\\src\\image\\win.png"));
            victory.setBounds(124,230,266,88);
            super.getContentPane().add(victory);
        }

        //加载数字图片
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JLabel image = new JLabel(new ImageIcon("stoneSmazeGame\\src\\image\\" + data[i][j] + ".png"));
                image.setBounds(50 + 100 * j, 90 + 100 * i, 100, 100);
                super.getContentPane().add(image);
            }
        }

        //背景图片
        JLabel background = new JLabel(new ImageIcon("stoneSmazeGame\\src\\image\\background.png"));
        background.setBounds(26, 30, 450, 484);
        super.getContentPane().add(background);

        //统计步数
        JLabel num_count = new JLabel("步数为:" + count);
        num_count.setBounds(50,20,100,20);
        super.getContentPane().add(num_count);

        //重新游戏
        JButton button = new JButton("重新开始");
        button.setFocusable(false);//JButton比较特殊，创建按钮后焦点默认在按钮上，需要取消焦点，否则键盘监听会失灵
        button.setBounds(350,20,100,20);

        Container container = super.getContentPane();
        container.add(button);
        //或者：
        //super.getContentPane().add(button);
        //add(button);
        newGame(button);


        super.getContentPane().repaint();//移除和重新添加之后需要 刷新面板 才行
    }

    @Override
    //接收键盘按键输入
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();//接收键盘按键对应的int型代号
        //System.out.println("keyCode:"+keyCode); 可以获取键盘录入的int型数值
        move(keyCode);//上下左右移动方块
        printView();
    }

    //上下左右移动方块
    private void move(int keyCode) {
        if (victory() == true){
            return;
        }
        int temp;
        if (keyCode == 37) {
            if (column != 0) {
                System.out.println("左移键");
                temp = data[row][column];
                data[row][column] = data[row][column - 1];
                data[row][column - 1] = temp;
                column--;
                count++;
            } else {
                System.out.println("点不动了...");
            }
        } else if (keyCode == 38) {
            if (row != 0) {
                System.out.println("上移键");
                temp = data[row][column];
                data[row][column] = data[row - 1][column];
                data[row - 1][column] = temp;
                row--;
                count++;
            } else {
                System.out.println("点不动了...");
            }

        } else if (keyCode == 39) {
            if (column != 3) {
                System.out.println("右移键");
                temp = data[row][column];
                data[row][column] = data[row][column + 1];
                data[row][column + 1] = temp;
                column++;
                count++;
            } else {
                System.out.println("点不动了...");
            }

        } else if (keyCode == 40) {
            if (row != 3) {
                System.out.println("下移键");
                temp = data[row][column];
                data[row][column] = data[row + 1][column];
                data[row + 1][column] = temp;
                row++;
                count++;
            } else {
                System.out.println("点不动了...");
            }

        }else if (keyCode == 90){//z键调用作弊器
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            row = 3;
            column = 3;
            //胜利时空白块一定在（3，3）
        }
    }

    //胜利判断
    private boolean victory(){
        if (row == 3 && column == 3){//胜利时空白块一定在（3，3）
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    if (data[i][j] != victory[i][j]){
                        return false;
                    }
                }
            }
        }else {
            return false;
        }
        return true;
    }
    //----------------------------------------------------------
    //暂时用不上的代码
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    //----------------------------------------------------------
}
