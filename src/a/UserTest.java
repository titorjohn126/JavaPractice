package a;

// 接口必须被子类实现, 抽象类要被子类继承
//接口中变量全为公共静态常量，抽象类中可以有普通变量
//接口中全为方法的声明，抽象类中可以有方法的实现
//接口中不可以有构造函数，抽象类中可以有
//接口可多实现，抽象类必须被单继承
//接口中方法全为抽象方法，抽象类中可以有非抽象方法
public class UserTest implements InterfaceTest{
    public void myPrint() {
        System.out.println("nihao");
    }
    public void insert(A a){
        System.out.println("新增");
    }
}
