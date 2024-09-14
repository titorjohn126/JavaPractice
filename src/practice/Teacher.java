package practice;

public class Teacher extends Person implements Cook, Sing{
    public Teacher(String name, int age, int sex) {
        super(name, age, sex);
    }

    @Override
    public void Saymyname() {
        super.MyInfo();
        super.Saymyname();
        System.out.println(" wo shi Teacher");
        Cook.super.cook();
        Sing.super.sing();
    }
}
