public class length{
    public static void main(String[] args) {
        String[] words = {"coffee", "water", "chai", "diet coke"};
        
        int minIndex = 0;
        for(int i=1; i<words.length; i++){
            if(words[i].length()<words[minIndex].length()){
                minIndex = i;
            }
        }
        System.out.println("Value - " + words[minIndex]);
        System.out.println("Index - " + minIndex);
    }
}p