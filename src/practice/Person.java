package practice;

public class Person {
    String name;
    int age;
    int sex;
    public Person(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void MyInfo() {
        System.out.println("wo jiao " + this.name);
        System.out.println("wo jin nian " + this.age + "sui");
        System.out.println("wo shi " + (this.sex == 1 ? "nan": "nv"));
    }
    public void Saymyname(){

        System.out.println("woshiren");
    }
}
