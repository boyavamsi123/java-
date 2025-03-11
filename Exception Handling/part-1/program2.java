
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class program2{
    //stacktrace
    /*
    * Exception name -  java.lang.ArithmeticException
    * Exception message -  / by zero
    * Which line number - program2.java:15
    * Methods info - 
    */
    public static void main(String[] args) throws FileNotFoundException, IOException{
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

        File file = new File("D:/resume.docx");
        FileInputStream fis = new FileInputStream(file);
        System.out.println(fis);
        try {
             result = fnumber / snumber;
        } catch (ArithmeticException ae) {
            System.out.println(ae.toString());  // write a logic to enter this message into log files
        }
        finally{
            System.out.println("Finally Block");
        }

        System.out.println("out put :"+result);
        System.out.println("program excution end");
    }
}   