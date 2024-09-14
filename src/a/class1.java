package a;

/**
 * 变量按所属数据类型划分：
 *      基本数据类型：整型、浮点型、字符、布尔型，存放在栈中
 *      引用数据类型：String 数组 接口 类
 * 变量按被声明的位置划分：
 *      局部变量：在方法或语句块里
 *      成员变量：方法外部，类内部
 */
public class class1 {
    String username; //成员变量
    public static void main(String[] args){
        int a = 97; //局部变量
        C c = new C(); //引用数据类型，前面在栈里，后面在堆里，从栈里指向堆里的数据
        //多种数据类型混合计算，会转换成容量最大的，小的（byte、short、char）可以转换成大的（int）(整型里）-long-double-float
        //a = 2; b = a++; :a = 3;b = 2
        //a = 2; b = ++a; :a = 3;b = 3
        char b = (char) a;//ascii码对应的是'a'
        int d = b;
        System.out.println(b);
        String str0 = "1" + 2 + 3; //123
        String str1 = 2 + 3 + "1"; // 51
        String str2 = 'a' + 1 + "hello";//98hello
        System.out.println(str0);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("5+5="+5+5);//字符串5拼接字符串5
        System.out.println('*' + '\t' + '*'); //93
        System.out.println("*" + '\t' + '*'); //* *
//        int i = 1;
//        i *= 0.1;
//        System.out.println(i); // 0,等价于i = (int) (i * 0.1)
        int i = 0;
        int j = 1;
        System.out.println(i != 0 & ++j == 2);//&和&&：&时，左边无论真假右边都参与计算；&&：左边为假，右边不参与计算
        System.out.println(i != 0 && ++j == 2);//&和&&：&时，左边无论真假右边都参与计算；&&：左边为假，右边不参与计算
    }
}

class C{

}