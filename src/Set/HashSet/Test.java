package Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//不能保证元素排列顺序
//不可重复，指的是hashcode不相同，要判断相同得首先equals相同，然后hashcode也相同
//不是线程安全
//集合元素可以使null
public class Test {
    public static void main(String[] args) {
        Set set = new HashSet();

//        set.add(1);
//        set.add("a");
//        System.out.println(set);
//        set.remove(1);
//
//        System.out.println(set.contains("a"));
//
//        set.clear();
//        System.out.println(set);
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("d");
        set.add(null);
        //使用迭代器遍历集合

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //for each
        for(Object obj : set){//把set的每一个值取出来赋值给obj直到循环set的所有值
            System.out.println(obj);
        }
        System.out.println(set.size());

        //如果想要集合只存同样的对象：使用泛型
        Set<String> set1 = new HashSet();
        set1.add("a");
    }
}
