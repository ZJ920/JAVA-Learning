package sdwz.zj.minterface1;

public class xyk implements myInterface{

    @Override
    public void pay(double pay) {
        System.out.println("使用信用卡支付了："+pay+"元");
    }
}
