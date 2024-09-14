package single;

public  class daimakuai {//在new执行时，类的属性的默认初始化和显示初始化；然后执行代码块的代码；再然后执行构造器代码
    String name;
    static int age;
    static TestPerson t = new TestPerson();//在开发中，将static的实例化类里的属性设置放在静态代码块里
    public daimakuai() {
        this.name = "张三";
        System.out.println("执行的是构造方法");
    }
    {
        System.out.println("执行的是非静态代码块");
    }

    static{
        t.age = 1;
        t.name = "";
        showage();
        //只能使用静态修饰的属性和方法,静态代码块在多次new的时候也只执行一次
    }
    public static void showage(){
        System.out.println(age);
    }

}
