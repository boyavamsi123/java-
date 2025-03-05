public class sumEvenNum{
    public static void main(String[] args) {
        int sum = 0;
        for(int i=40; i<=80; i+=2){
            sum+=i;
        }
        System.out.println("Sum of even numbers between 40 and 80 is: "+sum);
        //Sum of even numbers between 40 and 80 is: 1260
    }
}