package meiju;

public class Test {
    public static void main(String[] args) {
        Season spring = Season.SPRING;//这里返回的是枚举对象，就不用new了
        spring.showInfo();
        Season summer = Season.SUMMER;
        summer.showInfo();
        Season autumn = Season.AUTUMN;
        autumn.showInfo();
        Season winter = Season.WINTER;
        winter.showInfo();

        spring.test();
        Season spring1 = Season.SPRING;
        System.out.println(spring.equals(spring1));//每次执行Season.SPRING调用的是同一个对象，相等于写了一个单例模式
    }
}

enum Season implements Itest{//每个枚举都调用了有参的私有构造方法
    SPRING("春天","我是春天"),SUMMER("夏天","我是夏天"),AUTUMN("秋天", "我是秋天"),WINTER("冬天", "我是冬天");

    private final String name;
    private final String desc;

    private Season(String name, String desc){
        this.name = name;
        this.desc = desc;
    }

    public void showInfo(){
        System.out.println(this.name + " " + this.desc);
    }

    @Override
    public void test() {
        System.out.println("实现接口");
    }
}

interface Itest{
    void test();
}
