package a;
//重载：
//1 必须在同一个类
//2 方法名相同
//3 方法的参数个数、顺序或类型不同
//4 与方法的修饰符和返回值没有关系

//重写：
//当父类中的方法无法满足子类需求的时候需要红鞋
//重写的方法必须要和父类一摸一样（包括返回值类型、方法名、参数列表
//重写的方法可以使用@Override来标注
//子类中重写的方法的访问权限不能低于父类的
//private  < default < protected < public
public class class5 {
    public void myPrint(){
        System.out.println("我是父类重载方法1");
    }
    public int myPrint(int age){
        System.out.println("我是重载方法2");
        return 1;
    }
    public int myPrint(String name){
        System.out.println("我是重载方法2");
        return 1;
    }
    public int myPrint(int age, String name){
        System.out.println("我是重载方法2");
        return 1;
    }
    public int myPrint(String name, int age){
        System.out.println("我是重载方法2");
        return 1;
    }
}

class Test3{
    public static void main(String[] args) {
        class5 c = new class5();
        c.myPrint();
        c.myPrint(0);
    }
}