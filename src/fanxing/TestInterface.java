package fanxing;

public class TestInterface {
    public static void main(String[] args) {
//        B1<String> b1 = new B1<>();
//        B2 b2 = new B2();//不用指定泛型了

        Cc<Object> cc = new Cc<>();
        cc.test("xxxx");//泛型方法在调用之前没有固定的数据类型，在调用时会根据传入的参数来改变泛型
        cc.test(123);
        Integer i = cc.test1(2);
        Boolean b = cc.test1(true);
        Cc.test3("1");
        cc.test2("123","456");
    }

}

interface IB<T>{
    T test(T t);
}
//未传入泛型实参时，与泛型类的定义相同，在声明类的时候，需将泛型的声明一起加到类中
class B1<T> implements IB<T>{
    @Override
    public T test(T t) {
        return t;
    }
}

//如果实现接口时指定接口的泛型的具体数据类型，这个类实现接口所有方法的位置都要泛型替换实际时数据类型
class B2 implements IB<String>{

    @Override
    public String test(String s) {
        return s;
    }
}
//泛型方法
class Cc<E>{
    private E e;//在类上定义的泛型可以在普通方法中调用

    public static <T> void test3(T t){
        //在静态方法中不能使用类定义的泛型（不能调用非静态成员）
        System.out.println(t);
    }

    public <T> void test(T s){//无返回值泛型方法
        T t = s;
        System.out.println(this.e);
    }

    public <T> T test1(T s){//有返回值泛型方法
        return s;
    }

    public <T> void test2(T...strs){//形参为可变参数的泛型方法
        for(T s: strs){
            System.out.println(s);
        }
    }
}