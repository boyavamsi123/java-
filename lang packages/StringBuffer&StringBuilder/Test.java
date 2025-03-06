public class Test{
    /*
        * Strings are immutable
        * StringBuffer & StringBuilder are mutable
        */
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Yadagiri");
        StringBuffer sb2 = new StringBuffer("Yadagiri");
         System.out.println(sb1==sb2);

        sb1 = sb1.append("Reddy");
        System.out.println(sb1==sb2);

        StringBuffer sb3 = new StringBuffer("YadagiriReddy");
        System.out.println(sb1==sb3);

        System.out.println("======================================");

        String s1 = "Yadagiri";
        String s2 = "Yadagiri";
        System.out.println(s1==s2);

        s1 = s1 + "Reddy";
        System.out.println(s1==s2);

        String s3 = "YadagiriReddy";
        System.out.println(s1==s3);
    }
}