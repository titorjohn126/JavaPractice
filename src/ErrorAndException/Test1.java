package ErrorAndException;

public class Test1 {
    public static void main(String[] args) {
        B b = new B();
        try{
            b.test();
        }catch (Exception e){
            e.printStackTrace();
        }
//        b.test();//这里会报错，需要人去用try去处理
    }
}

class B{
    int i;
    public void test() throws Exception{//可以使用throws在代码这抛出异常，在调用方法捕获处理
        B b = null;
        System.out.println(b.i);
    }
}