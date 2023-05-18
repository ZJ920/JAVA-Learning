package day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class iteratorDemo {
    public static void main(String[] args){
        Collection<String> coll = new ArrayList<>();//多态写法，可以直接使用上面的写法
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);
        //遍历
        Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            String s = it.next();
            if (s.equals("bbb")){
                it.remove();//删除指针现指向的元素
            }
        }

        for(String s : coll){//数据类型 ： 集合、数组
            System.out.println(s);
        }

        System.out.println("-------------------------");
        //增强for
        int[] arr = {1,2,3,4,5,6,7,8,9};

        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println("-------------Arrays------------");
        int[] arr1 = {1,2,3,4,5,6};
        System.out.println(Arrays.equals(arr,arr1));

    }

}
