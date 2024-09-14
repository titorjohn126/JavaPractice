package practice;

public interface Cook {
    default void cook(){
        System.out.println("wo hui cook");
    }
}
