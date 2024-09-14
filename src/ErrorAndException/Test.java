package ErrorAndException;

//Error：JVM系统内部错误、资源耗尽等严重情况
//Exception：其他编程错误或偶然的外在因素导致的一般性问题
public class Test {
    public static void main(String[] args) {
////        A a = new A();
//        A a = null;
//        System.out.println(a.i);//空指针异常
//        int i = 0;
//        try{
//            System.out.println(1);
//            System.out.println(3/i);
//            System.out.println(2);//不执行
//        }catch (Exception e){//当不知道捕获的是什么异常时，使用所有的异常的父类
////            e.printStackTrace();
//            System.out.println(e.getMessage());
//            System.out.println(3);
//        }finally {
//            System.out.println(4);
//        }
//        System.out.println("ok");
        String[] strs = new String[]{"a","b"};
        A a = null;
        try{
            System.out.println(strs[2]);
            System.out.println(a.i);
        }catch (ArrayIndexOutOfBoundsException e1){
            System.out.println(e1.getMessage());
            e1.printStackTrace();
        }catch (NullPointerException e2){
            System.out.println(e2.getMessage());
            e2.printStackTrace();
        }
        System.out.println("ok");
    }
}

class A{
    int i;
}