package day10.map;

import day9.interfaceimp;
import day9.testinterface;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MapDemo{
    public static void main(String[] args){
        testinterface test = new interfaceimp();
        test.print();
        Map<String ,String> map = new HashMap<>();
        map.put("郭靖","黄蓉");
        map.put("韦小宝","沐健林");
        map.put("尹志平","小龙女");
        System.out.println(map.put("双儿","双儿"));
        //方式一：键值遍历（keySet），无序、不重复、无索引
        System.out.println("-------------------键值遍历（keySet）------------------------");
        Set<String> keyset = map.keySet();
        System.out.println("-------------------增强for------------------------");
        for(String key : keyset){
            System.out.println(key);
            String value = map.get(key);
            System.out.println("key:"+key+"--value:"+value);
        }
        System.out.println("---------------------迭代器----------------------");
        Iterator it = keyset.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-------------------lambda------------------------");
        keyset.forEach(s->System.out.println(s));
        //方式二:键值对对象（entrySet）
        //Map.Entry<String,String>：使用了Map接口中的Entry内部接口
        System.out.println("------------------键值对对象遍历（entrySet）-------------------------");
        Set<Map.Entry<String,String>> entries = map.entrySet();
        System.out.println("-------------------增强for------------------------");
        for(Map.Entry<String,String> entry : entries){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:"+key+"--value:"+value);
        }
        System.out.println("------------------迭代器-------------------------");
        Iterator it1 = entries.iterator();
        while (it1.hasNext()){
            Map.Entry<String,String> entry1 = (Map.Entry<String, String>) it1.next();
            System.out.println("key:"+entry1.getKey()+"--value:"+entry1.getValue());
        }
        System.out.println("--------------------lambda-----------------------");
        entries.forEach(new Consumer<Map.Entry<String, String>>() {
            @Override
            public void accept(Map.Entry<String, String> stringStringEntry) {
                String key = stringStringEntry.getKey();
                String value = stringStringEntry.getValue();
                System.out.println("key:"+key+"--value:"+value);
            }
        });
        System.out.println("--------------------方式三lambda-----------------------");
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println("key:"+key+"--value:"+value);
            }
        });
        System.out.println("---------------------------------------");

    }

}
