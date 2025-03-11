public class program3{
    //stacktrace
    /*
    * Exception name -  java.lang.ArithmeticException
    * Exception message -  / by zero
    * Which line number - program2.java:15
    * Methods info - 
    */
    public static void main(String[] args){ 
        method2();
    }
        public static void method2(){
            method1();
    }    
        public static void method1(){
        System.out.println("program execution start");
        int fnumber = 9;
        int snumber = 0;
        int result = 0;

        try {
             result = fnumber / snumber;
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());  // only is called getMessage() - / by zero
        }
        finally{
            System.out.println("Finally Block");
        }

        System.out.println("out put :"+result);
        System.out.println("program excution end");
    }
} 