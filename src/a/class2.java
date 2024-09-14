package a;

/**
 * 方法格式：
 * 权限修饰符 返回值声明 方法名称(参数列表){
 *     方法中封装的逻辑功能
 *     return 返回值
 * }
 *
 * 权限修饰符：public protected default private
 *类内部、本包、子类、外部包依次减少权限，外部包：src下面不同的包
 */

public class class2 extends A { //继承，class2为A的子类，
    public static void  main(String[] args){
        A a = new A();
        a.add(1, 2);
    }

}

class A{//只能有一个公共类
    private String name;

    int add(int x, int y){
        return x + y;
    }
}