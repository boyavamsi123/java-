class Byte{
    public static void main(String[] args) {
        byte a = 127;
        //byte b = 128;  // error: incompatible types: possible lossy conversion from int to byte
        byte c = -127;
        byte d = -128;
        // byte e = -129;  // error: incompatible types: possible lossy conversion from int to byte
        System.out.println(a);
        // System.out.println(b); //compile time error
        System.out.println(c);
        System.out.println(d);
        // System.out.println(e);  //compile time error
    }
}