package single;

public class Test {

    Singleton1 s = Singleton1.getInstance();
    Singleton2 s2 = Singleton2.getInstance();
    public static void main(String[] args) {
//        new daimakuai();
//        new daimakuai();
//        //匿名内部类
//        Animal animal = new Animal() {//构建了一个没有类名的子类，就不能显示的new方法创建对象，如果要在构造器中初始化属性，就不行了。只能在代码块里初始化
//            {//在匿名内部类，用代码块代替构造方法
//                super.name = "cat";
//            }
//
//            @Override
//            void makesound() {
//                System.out.println("murr");
//            }
//        };
//        animal.makesound();
//        System.out.println(animal.name);
        Test1 test1 = new Test1();
        test1.abstractMethod();
        test1.DefaultMethod();
        test1.Method_with_PrivateMethod();
        InterfaceMethod.staticMethod();

    }
}

class Test1 implements InterfaceMethod{
    public Test1() {

    }
    @Override
    public void abstractMethod() {
        System.out.println("abstractMethod");

    }
}

