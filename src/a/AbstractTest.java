package a;

public abstract class AbstractTest { //抽象类里可以有普通、抽象的方法、变量等
    public String username;
    int a = 3;
    public static int age = 33;

    public void myPrint(){
        System.out.println("nihao");

    }

    public abstract void myPrint2(); // 抽象方法没有打括号
}

class Son2 extends AbstractTest{ //抽象类不能被实例化，必须在子类重写

    @Override
    public void myPrint2() {
        System.out.println("你好");
    }
}