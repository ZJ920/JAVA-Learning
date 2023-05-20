package day9;

public class StudentTest implements Comparable<StudentTest> {
    private String name;
    private int age;
    private int chaneseNum;
    private int mathNum;
    private int englishNum;
    private int sum;

    public StudentTest() {
    }

    public StudentTest(String name, int age, int chaneseNum, int mathNum, int englishNum) {
        this.name = name;
        this.age = age;
        this.chaneseNum = chaneseNum;
        this.mathNum = mathNum;
        this.englishNum = englishNum;
        sum = chaneseNum+englishNum+mathNum;
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

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return chaneseNum
     */
    public int getChaneseNum() {
        return chaneseNum;
    }

    /**
     * 设置
     * @param chaneseNum
     */
    public void setChaneseNum(int chaneseNum) {
        this.chaneseNum = chaneseNum;
    }

    /**
     * 获取
     * @return mathNum
     */
    public int getMathNum() {
        return mathNum;
    }

    /**
     * 设置
     * @param mathNum
     */
    public void setMathNum(int mathNum) {
        this.mathNum = mathNum;
    }

    /**
     * 获取
     * @return englishNum
     */
    public int getEnglishNum() {
        return englishNum;
    }

    /**
     * 设置
     * @param englishNum
     */
    public void setEnglishNum(int englishNum) {
        this.englishNum = englishNum;
    }
    @Override
    public String toString() {
        return "studentTest{name = " + name + ", age = " + age + ", chaneseNum = " + chaneseNum + ", mathNum = " + mathNum + ", englishNum = " + englishNum + ",  sum ="+sum+"}";
    }

    @Override
    public int compareTo(StudentTest o) {
        int sum  = this.getChaneseNum()+this.getEnglishNum()+this.getMathNum();
        int sum1 = o.getChaneseNum()+o.getEnglishNum()+o.getMathNum();
        if (sum > sum1){
            return -1;
        }else if (sum < sum1){
            return 1;
        }else {
            if (this.chaneseNum > o.chaneseNum){
                return -1;
            }else if (this.chaneseNum < o.chaneseNum){
                return 1;
            }else {
                if (this.mathNum > o.mathNum){
                    return -1;
                }else if (this.mathNum < o.mathNum){
                    return 1;
                }else {
                    if (this.englishNum > o.englishNum){
                        return -1;
                    }else if (this.englishNum < o.englishNum){
                        return 1;
                    }else {
                        if (this.age > o.age){
                            return -1;
                        }else if (this.age < o.age){
                            return 1;
                        }else {
                            this.getName().compareTo(o.getName());
                        }
                    }
                }
            }
        }
        return 0;
    }

    /**
     * 获取
     * @return sum
     */
    public int getSum() {
        return sum;
    }

}
