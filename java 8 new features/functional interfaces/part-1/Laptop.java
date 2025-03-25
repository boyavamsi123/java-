

public interface Laptop{
    public void copy();
    public void paste();
    public void cut();
    public void keyboard();

    default void security(){
        commoncode();
        System.out.println("Laptop security code");
    }

    static void Audio(){
        commoncode();
        System.out.println("Laptop Audio code");
    }

    private static void commoncode(){
        System.out.println("Laptop commoncode code");
    }
}