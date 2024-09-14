package Set.List;

import java.util.List;
import java.util.ArrayList;
//元素有序，且可重复，默认按元素的添加顺序设置元素的索引 ArrayList类 List接口 Collections接口
//ArrayList线程不安全，Vector线程安全
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("d");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list.get(0));
        list.add(1, "f");//其他的往后移一位
        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list1.add("123");
        list1.add("456");

        list.addAll(2, list1);//指定位置插入集合
        System.out.println(list);

        System.out.println(list.indexOf("d"));//第一次出现的索引下标
        System.out.println(list.lastIndexOf("d"));//最后一次出现
        System.out.println(list.size());
        list.remove(2);

        list.set(1, "ff");//根据指定元素下标修改元素
        System.out.println(list);

        List<String> subList =  list.subList(2, 4);//截取元素形成新的集合，前闭后开
        System.out.println(subList);
    }

}
