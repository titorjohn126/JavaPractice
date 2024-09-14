package single;

/**
 * 懒汉式：等到第一次调用才创建对象，最开始是null，之后所有调用的都用这个对象
 */
public class Singleton2 {
    private Singleton2() {

    }
    private static Singleton2 s1 = null;

    public static Singleton2 getInstance() {
        if (s1 == null) {
            s1 = new Singleton2();
        }
        return s1;
    }
}
