package practice;

public class Main {
    public static void main(String[] args) {
//        Teacher teacher = new Teacher("zhangsan",1,1);
        Person person = new Teacher("lisi",1,1);
        Teacher teacher1 = (Teacher) person;
//        teacher.Saymyname();
        teacher1.Saymyname();
    }
}
