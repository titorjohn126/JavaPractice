package practice;

public interface Sing {
    default void sing(){
        System.out.println("wohui sing");
    }
}
