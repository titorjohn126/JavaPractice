package a;
//接口实现多重继承，能继承好几个父类
//接口是抽象方法和常量值的定义和集合
//一个类可以实现多个接口，接口可以继承其他接口
public interface InterfaceTest {//java 8 以后，接口有4种方法：抽象方法、默认方法：有方法体，静态方法：只能通过接口本身调用，
    // 接口中所有定义的方法都是public abstract，但是太长了不写
    //变量只能为public static final类型的
    //public abstract void add()；方法都是抽象的
    //等效于 void add():

    // int age = 99;
    //等效于 public static final int age = 99;
    int age = 33;
    void myPrint();
    void insert(A a);
}
