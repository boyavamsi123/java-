public class User{
    public static void main(String[] args) {
        Lenovo lenovo = new Lenovo();
        lenovo.copy();
        lenovo.paste();
        lenovo.capture();
        lenovo.security();

        System.out.println("==========================");

        Laptop.Audio();

        System.out.println("==========================");

        Hp hp = new Hp();
        hp.printing();

        System.out.println("==========================");

        Apple apple = new Apple();
        apple.cut();
    }
}