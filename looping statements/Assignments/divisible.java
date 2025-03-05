public class divisible{
    public static void main(String[] args) {
        System.out.println("Numbers divisible by 7 between 150 and 200 :");
        for(int i=150; i<=200; i++){
            if(i % 7 == 0){
                System.out.println(i);
            }
        }
    }
}