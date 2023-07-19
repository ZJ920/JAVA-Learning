package day14.trycatch;

public class GirlFriend {
    String name;
    int age;

    public GirlFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public GirlFriend() {

    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 10){
            throw new NameException(name+":姓名输入有误");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (18 < age || 12 >age){
            throw new AgeException(age+"：年龄范围输入有误");
        }
        this.age = age;
    }
}
