package single;

public interface InterfaceMethod {
    void abstractMethod();
    default void DefaultMethod() {
        System.out.println("Default InterfaceMethod");
    }
    static void staticMethod() {
        System.out.println("Static InterfaceMethod");
    }

}
