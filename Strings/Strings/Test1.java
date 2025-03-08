public class Test1{
    public static void main(String[] args) {
        String s1 = "ProStack";
        String s2 = new String("ProStack");

        s1.concat("Academy");

        String s3 = "Vamsi";

        int strlength = s1.length();
        int str1length = s2.length();
        int str2length = s3.length();

        System.out.println(s1); //ProStack
        System.out.println(s2); //ProStack

        System.out.println(s1==s2);  //false
        System.out.println(s1.equals(s3));  //false

        System.out.println(strlength);  //8
        System.out.println(str1length); //8
        System.out.println(str2length); //5

        System.out.println(s1.substring(3)); //Stack
        System.out.println(s2.substring(3)); //Stack
        System.out.println(s3.substring(3)); //si

        System.out.println(s1.equals("ProStack")); //true
        System.out.println(s2.equals("ProStack")); //true

        System.out.println(s1.equalsIgnoreCase("ProStack")); //true
        System.out.println(s2.equalsIgnoreCase("ProStack")); //true
    }
}