package Set.Map;
//map接口，hashmap类实现


import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

//判断两个key相等的标准：key通过equals方法返回true，hashCode也相等
public class Test {
    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>();
//        map.put("a", 1);
//        map.put("b", 2);
//        map.put("c", 2);
//        System.out.println(map);
//        System.out.println(map.get("a"));//根据key取值
//        map.remove("c");
//        System.out.println(map.size());
//        System.out.println(map.containsKey("a"));
//        System.out.println(map.containsValue("a"));
//
//        //遍历map集合
//        Set<String> keys = map.keySet();//获取key集合
//        for (String key : keys) {
//            System.out.println(key + ":" + map.get(key));
//        }
//
//        Set<Map.Entry<String, Integer>> entrys = map.entrySet();
//        for (Map.Entry<String, Integer> entry : entrys) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//    }
        Map<Integer, String> map = new TreeMap<>();
        map.put(4,"a");
        map.put(5,"a");
        map.put(6,"a");
        System.out.println(map);

        Map<String, String> map1 = new TreeMap<>();//自然排序是字典排序
        map1.put("b", "b");
        map1.put("c", "c");
        map1.put("d", "d");
        map1.put("e", "e");
        map1.put("ab", "ab");
        map1.put("01", "01");
        System.out.println(map1);
        }



}
