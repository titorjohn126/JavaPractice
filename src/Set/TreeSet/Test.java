package Set.TreeSet;

import java.util.*;

//TreeSet是SortedSet接口的实现类，可以确保元素处于排序状态，默认使用自然排序，调用集合元素的compareTo方法把元素按升序排列
public class Test {
    public static void main(String[] args) {
//        Set<Integer> set = new TreeSet<Integer>();
//        set.add(1);
//        set.add(3);
//        set.add(5);
//        set.add(2);
//        System.out.println(set);
//        set.clear();
//        Iterator<Integer> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        for(Integer integer : set) {
//            System.out.println(integer);
//        }
        Person p1 = new Person(10, "zhangsan");
        Person p2 = new Person(20, "lisi");
        Person p3 = new Person(5, "wangwu");
        Set<Person> set = new TreeSet<>(new Person());//这里为什么要放一个new Person()呢？这里作为Comparator的参数
        set.add(p1);
        set.add(p2);
        set.add(p3);
        Iterator<Person> iterator = set.iterator();
        while (iterator.hasNext()) {
            iterator.next().show();
        }
    }


}

class Person implements Comparator<Person> {//把person对象存到Treeset中按年龄排序
    int age;
    String name;
    public Person() {

    }
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void show(){
        System.out.println("i am " + this.name + " and age is " + this.age);
    }
    @Override
    public int compare(Person o1, Person o2) {//定制排序
        if (o1.age > o2.age){
            return 1;
        }else if (o1.age < o2.age){
            return -1;
        }else{
            return 0;
        }
    }
}