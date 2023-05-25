package day10.map;

import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class MapDemo3 {
    public static void main(String[] args){
        TreeMap<Shop , String> shopMap = new TreeMap<>();
        Shop shop  = new Shop(3,"西瓜");
        Shop shop2 = new Shop(1,"李子");
        Shop shop3 = new Shop(2,"芒果");
        Shop shop4 = new Shop(4,"桃子");
        Shop shop5 = new Shop(5,"橘子");

        shopMap.put(shop,shop.getName());
        shopMap.put(shop2,shop2.getName());
        shopMap.put(shop3,shop3.getName());
        shopMap.put(shop4,shop4.getName());
        shopMap.put(shop5,shop5.getName());

        Set<Shop> set = shopMap.keySet();

        for (Shop set1 : set){
            String value = shopMap.get(set1);
            System.out.println(set1+"--"+value);
        }

        shopMap.forEach(new BiConsumer<Shop, String>() {
            @Override
            public void accept(Shop shop, String name) {
                System.out.println(shop.getId()+"---"+name);
            }
        });

    }
}
