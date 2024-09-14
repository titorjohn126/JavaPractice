package a;

public class Polymorphism {//若编译时类型和运行时类型不一致，就出现多态（对象的多态）
    //Person p = new Person();
    //Student s = new Student();//假设Student继承Person
    //Person e = new Student();//父类的引用对象可以指向子类的实例，向上转型：子类的对象可以给父类对象引用
    //此时，e不能访问子类中添加的属性和方法，因为编译时e是Person类型，没有Student里的变量
    //调用e时，调用的是student的重写方法（如果有），因为运行时确定的e是new Student
    //Person p = new Person();
    //p = new Student();//更改了p的指向

    public static void main(String[] args) {
        int i = Integer.parseInt("123");
        String s = String.valueOf(i);
        String j = "123";

        System.out.println(s);
    }
}
