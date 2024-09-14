package a;


public class TEST {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.setValue(10);

        int value1 = obj.getValue(); // value1 和 obj.getValue() 的值不同
        System.out.println("value1: " + value1);
        System.out.println("obj.getValue(): " + obj.getValue());
    }
}

class MyClass {
    private int value; // 存储在堆内存中

    public void setValue(int value) {
        this.value = value; // 修改堆内存中 MyClass 对象的 value 字段
    }

    public int getValue() {
        return value; // 返回堆内存中 MyClass 对象的 value 字段的值
    }
}
