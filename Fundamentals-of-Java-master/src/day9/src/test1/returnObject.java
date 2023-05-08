package day9.src.test1;

class Object{
    int i;
    Object(int a){    //类Object的构造方法
        i = a;
    }
    Object returnObj(){    //返回值为Object类型的方法returnObj()，这个方法会返回一个对象obj
        Object obj = new Object(i+10);    //方法的作用是将i+10
        System.out.println("obj的地址："+obj);
        return obj;
    }
}
public class returnObject {
    public static void main(String[] args) {
        Object o1 = new Object(3);    //调用构造方法创建对象
        Object o2 = o1.returnObj();    //调用方法创建并返回对象:3+10
        System.out.println("o1的地址："+o1);//o1保存的地址
        System.out.println("o2的地址："+o2);
        System.out.println(o1.i);
        System.out.println(o2.i);
        Object o3 = o2.returnObj();    //再次调用方法并返回对象:13+10
        System.out.println(o3.i);

        o2=o2.returnObj();//13+10
        System.out.println(o2.i);

        System.out.println("------");
        Object i1 = new Object(3);    //调用构造方法创建对象
        i1=i1.returnObj().returnObj().returnObj();//3+10+10+10
        System.out.println(i1.i);
    }
}