package fanxing;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();//在编译期有效

        A<String> a1 = new A<>();//在new A的对象时指定泛型的类型String
        a1.setT("xxxx");//对象使用setT的形参就是String类型
        String s = a1.getT();//返回值由new对象确定String类型

        A a2 = new A<>();//不指定泛型相当于指定了一个obj类型
        a2.setT(new Object());
        Object o = a2.getT();

        //同样的类，在new对象时泛型指定了不同的数据类型，这些对象不能互相赋值
        A<Integer> a3 = new A<>();
//        a1 = a3;
    }

}


/**
 * 此处泛型T可以任意取名
 * 一般使用T
 * @param <T>
 */
class A<T>{
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return this.t;
    }
}