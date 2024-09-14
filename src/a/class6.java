package a;

public class class6 {
    public void printInfo(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
    public void printInfo2(String... args) {//可变参数，如果有多个形参，可变参数要放在最后
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
class test4 {
    public static class DataSwap {
        public int a;
    }

    public static class TestTransfer1 {
        public static void swap(DataSwap ds1) {
            ds1.a = 6;
            System.out.println("swap方法里，ds1.a的值是" + ds1.a);
        }

        public static void main(String[] args) {//引用数据类型形参和实参存的是堆内存里对象的地址，指向同一个堆内存里的对象
            DataSwap ds = new DataSwap();
            System.out.println("调用swap方法前，ds.a的值是" + ds.a);
            swap(ds);
            System.out.println("调用swap方法后，ds.a的值是" + ds.a);

        }
    }

    public static void swap(int i) {
        i = 6;
        System.out.println("swap方法里，i的值是：" + i);
    }

    public static void main(String[] args) {//基础数据类型在参数的传递过程中，就是把实参的值复制到形参上
        int a = 0;
        swap(a);
        System.out.println("main方法里，a的值是：" + a);
//        class6 c = new class6();
//        String[] arr = new String[]{"jsdfi", "wi"};
//        String[] arr1 = new String[]{"jsdfi", "wi","dskfaj"};
//        c.printInfo(arr);
//        c.printInfo(arr1);
//        c.printInfo2("jsdfi", "wi");
//        c.printInfo2("wi");
//        c.printInfo2();
//        c.printInfo(null);//可变参数可以不填，不可变的必须传递null
    }
}