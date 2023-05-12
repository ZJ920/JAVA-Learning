package day8.test1;
//看懂了，不会用。
import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        interlist myinterlist = new interlist();
        yewua a = new yewua();
        a.realize_a(myinterlist);
        yewub b = new yewub();
        b.realize_b(myinterlist);

        //消费它们
        myinterlist.hello();
    }
}

interface inter {
    public void hello();
}

class interlist implements inter {
    private List<inter> inters = new ArrayList<>();
    private int i = 0;

    public void addinter(inter i) {
        inters.add(i);
    }
    @Override
    public void hello() {
        System.out.println("hello list");
        //统一消费它们
        for (; i < inters.size(); i++) {
            inter in = inters.get(i);
            in.hello();
        }
    }
}

class yewua {
    //业务a
    public void realize_a(interlist myinterlist) {
        myinterlist.addinter(new inter() {
            public void hello() {//接口重写
                System.out.println("hello yewua_realize");
            }
        });
    }
}

class yewub {
    //业务b
    public void realize_b(interlist myinterlist) {
        myinterlist.addinter(new inter() {
            public void hello() {
                System.out.println("hello yewub_realize");
            }
        });
    }
}



