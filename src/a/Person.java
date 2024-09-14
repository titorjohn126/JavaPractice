package a;
// 类的封装：将某些信息隐藏在类的内部，通过get和set来访问和操作

//类的重载：创建对象时初始化对象，为对象成员变量赋初始值，根据参数个数不同或参数类型不同来区分：构造函数的重载

// this:不能用在static方法
// super:指向子类中的父类对象，可以访问父类的属性、函数以及构造函数
// 子父类存在同名的成员（包括变量和方法）时，在子类默认是访问子类的成员，可以通过super指定访问父类的成员
// 默认会先调用父类无参的构造方法，可以通过super关键字指定调用父类的构造方法
public class Person {
    private int age;
    private String name;

    public Person(){ //无参的

    }
    public Person(String name){ // 有一个参数
        this.name = name;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            System.out.println("您的年龄不合法");
        }else{
            this.age = age;
        }
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Test2{
    public static void main(String[] args) {
        Person person = new Person("zangsan", 22);// 重载和set不同的地方就在于重载可以直接在new的时候赋值
        new Person().getAge();//匿名对象
        System.out.println(person.toString());
    }
}