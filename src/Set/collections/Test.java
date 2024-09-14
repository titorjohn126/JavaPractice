package Set.collections;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<String>();
//        list.add("b");
//        list.add("cd");
//        list.add("c");
//        list.add("a");
//        list.add("1");
//        System.out.println(list);
//        Collections.reverse(list);
//        System.out.println(list);
//        Collections.shuffle(list);//随机排序
//        System.out.println(list);
//        Collections.sort(list);//字典升序排列
//        System.out.println(list);
//        Collections.swap(list, 0, 1);
//        System.out.println(list);
//        System.out.println(Collections.max(list));
//        System.out.println(Collections.min(list));
//        System.out.println(Collections.frequency(list, "a"));
//        Collections.replaceAll(list, "a", "A");
//        System.out.println(list);

        Student s1 = new Student(14, "zhangsan");
        Student s2 = new Student(11, "lisi");
        Student s3 = new Student(13, "wangwu");

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (Student student : list) {
            System.out.println(student.name + " " + student.age);

        }
        Collections.sort(list, new Student());
        for (Student student : list) {
            System.out.println(student.name + " " + student.age);

        }

    }
}

class Student implements Comparator<Student> {
    int age;
    String name;

    public Student(){

    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;

    }

    @Override
    public int compare(Student o1, Student o2) {//根据年龄升序排列
        if (o1.age > o2.age){
            return 1;
        }else if (o1.age < o2.age){
            return -1;
        }else {
            return 0;
        }
    }
}