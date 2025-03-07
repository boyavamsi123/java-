public class Test{
    public static void main(String[] args){
        String s1 = "Hello";
        String s2 = new String("Hello");
        String emailid = "hyadagirireddytutorials234@gmail.com";
        String s3 = "Hello";

        System.out.println(s1);
        System.out.println(emailid);
        System.out.println(s1+emailid);
        System.out.println(s2);
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==emailid);
    }
}