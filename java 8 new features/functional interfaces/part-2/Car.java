@FunctionalInterface
public interface Car{
    void drive();
    default void honk1(){}
    private void honk2(){}
    static void light(){}
    static  void breaks(){}
}

