package sdwz.zj.pokergame;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    //牌盒
    static ArrayList<String> list = new ArrayList<>();
    static {
        //花色牌号拼接
        String[] color = {"♣","♦","♥","♠"};
        String[] name  = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        for(String c : color){
            for(String n : name){
                list.add(c + n);
            }
        }
        list.add("大王");
        list.add("小王");
    }

    public PokerGame(){
        //洗牌
        Collections.shuffle(list);
        //发牌
        ArrayList<String>[] arr = Licensing();
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
}
