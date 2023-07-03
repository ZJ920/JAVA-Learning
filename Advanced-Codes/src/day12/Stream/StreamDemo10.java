package day12.Stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo10 {
    public static void main(String[] args) {

        /*
            collect(Collector collector)            收集流中的数据，放到集合中 (List Set Map)

            注意点：
                如果我们要收集到Map集合当中，键不能重复，否则会报错
       */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-15", "周芷若-女-14", "赵敏-女-13", "张强-男-20",
                "张三丰-男-100", "张翠山-男-40", "张良-男-35", "王二麻子-男-37", "谢广坤-男-41");
        List<String> list1 = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toList());
        System.out.println(list1);

        Map<String, Integer> newMap = list.stream()
                                          .filter(s -> "男".equals(s.split("-")[1]))
                                          .collect(Collectors.toMap(
                                                  new Function<String, String>() {
                                                      @Override
                                                      public String apply(String s) {
                                                          //s = "张无忌-男-15"
                                                          return s.split("-")[0];
                                                      }},
                                                  new Function<String, Integer>() {
                                                      @Override
                                                      public Integer apply(String s) {
                                                          return Integer.parseInt(s.split("-")[2]);
                                                      }}));
        System.out.println(newMap);
    }
}
