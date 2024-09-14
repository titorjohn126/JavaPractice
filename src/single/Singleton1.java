package single;

/**
 * 饿汉式单例模式
 */
public class Singleton1 {
    private Singleton1() {//构造方法私有化，别人调用这个类就不能使用new创建这个对象

    }
    private static Singleton1 single = new Singleton1();//私有的Singleton1类型类变量

    public static Singleton1 getInstance() {
        return single;
    }
}
