package day10.map;

public class Shop implements Comparable<Shop>{
    private int id;
    private String name;

    public Shop() {
    }

    public Shop(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return Integer.toString(id);
    }

    @Override
    public int compareTo(Shop o) {
        int i =o.getId()-this.getId();
        return i;
    }
}
