package day2.minterface1;

public class yhk implements myInterface{

    @Override
    public void pay(double pay) {
        System.out.println("使用银行卡支付了："+pay+"元");
    }
}
