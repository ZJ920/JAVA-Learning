package day9.ommonAlgorithms;

public class getNum {

    //递归求和
    public static int getNum(int number,boolean t){
        if (number == 1){
            return 1;
        }
        if (t){
            return number*getNum(number-1,t);
        }
        return number + getNum(number-1,t);
    }
}
