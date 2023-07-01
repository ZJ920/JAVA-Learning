package day2.minterface;

public class test1 {
    public static void main(String[] args){
        B b = new B();
        b.show();
        b.method();
        new DuiXiang();

    }
}
interface A{
    public abstract void show();
    public abstract void method();
}
class B implements A{

    @Override
    public void show() {
        System.out.println("show...");
    }

    @Override
    public void method() {
        System.out.println("method...");
    }
}
