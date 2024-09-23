package Annotation;

import java.lang.annotation.*;
import java.util.ArrayList;
import java.util.List;

//@Override:重写
//@Deprecated 表示某个程序元素已过时
//@SuppressWarnings:抑制编译器警告
public class Test {
    @TestAnn(id=100, desc = "姓名")
    String name;

    public static void main(String[] args) {
        TestB b = new TestB();
        b.test();

        @SuppressWarnings("unused")
        List list = new ArrayList();
    }
}

class TestA{
    public void test(){
        System.out.println("TestA");
    }
}

class TestB extends TestA{
    @Override
    public void test(){
        super.test();
    }

    @Deprecated
    public void test1(){

    }
}

@Target(ElementType.FIELD)//这个代表我现在是给其他类的属性做注解
@Retention(RetentionPolicy.RUNTIME)//定义注解的声明周期，整个的程序运行
@Documented//把注解放到文档里
@interface TestAnn{
    public int id() default 0;

    public String desc() default "";
}