package day8.Integer;
//十进制转二进制
public class integer {
    public static void main(String[] args){
        int i = 10;
        StringBuilder sb = new StringBuilder();
        while (true){
            for (int j = 0; i > 0; j++) {
                int index = i%2;
                sb.insert(0,index);
                i = i/2;
            }
            break;
        }
        System.out.println(sb);
    }
}
