package fanxing;

import java.util.ArrayList;
import java.util.List;

public class tongpeifu {
    public static void main(String[] args) {
        Dd d = new Dd();
        List<String> l1 = new ArrayList<>();
        d.test(l1);

        List<Integer> l2 = new ArrayList<>();
        d.test(l2);

        List<C1> c1 = new ArrayList<>();
        List<D1> d1 = new ArrayList<>();
        d.test1(d1);
        List<B3> b3 = new ArrayList<>();
//        d.test1(b3);//不行
        List<A1> a1 = new ArrayList<>();
        d.test2(a1);

        List<IAimp1> iaimp1 = new ArrayList<>();
        d.test3(iaimp1);


    }
}

class Dd{
     public void test(List<?> list){//test方法需要一个list集合参数，不确定list集合到底是存的什么类型

     }

     public void test1(List<? extends C1> list){//C1及其子类

     }

     public void test2(List<? super C1> list){}//C1及其父类
     public void test3(List<? extends IA> list){}//list参数的元素类型是IA的实现类
}

class A1{

}

class B3 extends A1{

}

class C1 extends B3{

}

class D1 extends C1{

}

interface IA{}

class IAimp1 implements IA{}