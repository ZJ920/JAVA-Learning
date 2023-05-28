package sdwz.zj.pokergame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class PokerGame {
    //牌盒
    static TreeMap<String,Integer> hm = new TreeMap<>();
    static ArrayList<String> list = new ArrayList<>();
    static {
        //花色牌号拼接
        int serialNumber = 1;
        String[] color = {"♣","♦","♥","♠"};
        String[] name  = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        for(String n : name){
            for(String c : color){
                list.add(c + n);
            }
        }
        list.add(" 大王");
        list.add(" 小王");

        //指定牌的价值
        hm.put("J",11);
        hm.put("Q",12);
        hm.put("K",13);
        hm.put("A",14);
        hm.put("2",15);
        hm.put("小王",16);
        hm.put("大王",17);
    }

    public PokerGame(){
        //洗牌
        Collections.shuffle(list);
        //发牌
        ArrayList<String>[] arr = Licensing();
        //排序
        order(arr);
        //看牌
        lookPoker(arr);

        System.out.println(list.size()+"张牌： "+list);
    }

    //发牌
    private ArrayList<String>[] Licensing() {
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            //获取牌
            String poker = list.get(i);
            //三张地主牌
            if (i < 3){
                lord.add(poker);
                continue;
            }
            //轮流发牌
            if (i % 3 == 0){
                player1.add(poker);
            }else if (i % 3 == 1){
                player2.add(poker);
            }else{
                player3.add(poker);

            }
        }
        return new ArrayList[]{lord, player1, player2, player3};
    }

    //排序
    public void order(ArrayList[] arr){
        for (ArrayList arr1 : arr){
            Collections.sort(arr1, new Comparator<String>() {
                //Collections.sort使用了Arrays.sort：插入排序+二分查找
                @Override
                public int compare(String poker1, String poker2) {
                    String color1 = poker1.substring(0,1);//截取花色
                    int value1 = getValue(poker1);//获取价值

                    String color2 = poker2.substring(0,1);//截取花色
                    int value2 = getValue(poker2);//获取价值
                    //根据牌的价值从大到小排序
                    return value1 - value2 == 0 ? color1.compareTo(color2) : value2 - value1;
                }
            });
        }

    }

    //看牌
    public void lookPoker(ArrayList<String>[] arr){
        for (int i = 0; i < arr.length; i++) {
            switch (i){
                case 0:
                    System.out.println(arr[i].size()+"底牌： "+arr[i]);
                    break;
                case 1:
                    System.out.println(arr[i].size()+"玩家1： "+arr[i]);
                    break;
                case 2:
                    System.out.println(arr[i].size()+"玩家2： "+arr[i]);
                    break;
                case 3:
                    System.out.println(arr[i].size()+"玩家3： "+arr[i]);
                    break;
            }
        }

    }

    //获取牌的价值
    public int getValue(String poker){
        //把这里截取出来的结果，让这个结果再Map集合中存在 “ 大王”
        String value = poker.substring(1);
        //拿着value值到map集合中判断是否存在
        if (hm.containsKey(value)){
            return hm.get(value);
        }else {
            return Integer.parseInt(value);
        }
    }
}
