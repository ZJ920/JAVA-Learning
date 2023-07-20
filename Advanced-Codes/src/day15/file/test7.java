package day15.file;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test7 {
    public static void main(String[] args){

        File f1 = new File("D:\\我的文件");
        HashMap<String ,Integer> hashMap = findFile(f1);
        Set<Map.Entry<String,Integer>> entries = hashMap.entrySet();
        for (Map.Entry<String,Integer> entry : entries){
            System.out.println("类型："+entry.getKey());
            System.out.println("数量："+entry.getValue());
            System.out.println("--------------------------");
        }
    }
    /*
     *
     * */
    public static HashMap<String,Integer> findFile(File file){
        HashMap<String,Integer> hashMap = new HashMap<>();
        File[] files = file.listFiles();
        for (File file1 : files){
            if (file1.isFile()){
                //文件
                //获取文件后缀
                String key;
                String[] arr = file1.getName().split("\\.");
                if (arr.length > 1){
                    //长度大于一说明有后缀
                    key = arr[arr.length-1];
                    if (hashMap.containsKey(key)){
                        //如果已有该类型文件
                        int count = hashMap.get(key);
                        count++;
                        hashMap.put(key,count);
                    }else {
                        //如果没有有该类型文件
                        hashMap.put(key,1);
                    }
                }

            }else {
                //子文件夹，递归
                //子文件夹文件统计
                HashMap<String,Integer> hashMap1 = findFile(file1);
                //合并文件数
                Set<Map.Entry<String, Integer>> entries= hashMap1.entrySet();
                for (Map.Entry<String,Integer> entry: entries){
                    if (hashMap.containsKey(entry.getKey())){
                        //如果键值存在
                        int count = hashMap.get(entry.getKey());
                        count = count + entry.getValue();
                        hashMap.put(entry.getKey(),count);
                    }else {
                        hashMap.put(entry.getKey(),entry.getValue());
                    }
                }
            }
        }
        return hashMap;
    }
}
