package a;
//重写：
//当父类中的方法无法满足子类需求的时候需要重写
//重写的方法必须要和父类一摸一样（包括返回值类型、方法名、参数列表
//重写的方法可以使用@Override来标注
//子类中重写的方法的访问权限不能低于父类的
//private  < default < protected < public

// this:不能用在static方法
// super:指向子类中的父类对象，可以访问父类的属性、函数以及构造函数
// 子父类存在同名的成员（包括变量和方法）时，在子类默认是访问子类的成员，可以通过super指定访问父类的成员
// 默认会先调用父类无参的构造方法，可以通过super关键字指定调用父类的构造方法
// super只能出现在方法的第一条语句

//static:可以修饰变量、方法、代码块
//可以直接调用，不用new一个类出来

//final:修饰的类不能被继承，修饰的方法不能被重写，但是子类可以用父类中final修饰的方法
//修饰变量：基本类型变量使用final修饰类就不可变
//引用类型变量：引用类型不可变，但是引用对象的内容可以改变 接口、类、数组、String
public class Parent {
    static{
        int a = 3;
    }
    private static String name = "zhangsan";
    protected void myPrint() {
        System.out.println("我是父类方法");
    }
    public static void myPrint1(){
        System.out.println("我是父类的静态方法");
    }
}

class Child1 extends Parent {
    public void myPrint() {
        super.myPrint();
        System.out.println("我是子类方法");
    }

}

class Test5 {
    public static void main(String[] args) {
//        Child1 child1 = new Child1();
//        child1.myPrint();
//        Parent.myPrint1();
        new Parent().myPrint();
        Child1 a = new Child1();
        Parent b = new Parent();
        System.out.println(new Person("nima").getName());
        System.out.println(new Child1());
        System.out.println(a instanceof Parent);
        System.out.println(b instanceof Child1);
        String s1 = new String("abc");//在常量池添加abc，在堆中创建值为abc的对象，返回指向堆中s1的引用
        String s2 = new String("abc");//常量池已有值为abc的对象，不做处理，在堆中创建值为abc的对象s2，返回堆中s2的引用
//        String s1 = "abc";//常量池添加abc
//        String s2 = "abc";//通过.equals()判断常量池已有值为abc，然后返回相同的引用
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));//特殊：String、File、Date使用==比较的是对象（对象的地址），equals比较这些的是值，其他的和==一样
        String s3 = new String("1") + new String("2") + new String("3");//通过stringbuilder实现，在常量池添加1和2，在堆中创建值为122的对象，把引用地址给s3
        Parent c = new Parent();
        Child1 d = new Child1();
        Parent e = d;
        Child1 f = (Child1) c;
    }
}
