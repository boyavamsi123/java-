public class AverageCalculator {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 9, 6};   
        int sum = 0;

        for (int num : arr) {
            sum += num; 
        }

        int average = sum / arr.length;
        System.out.println(average); // Output: 5
    }
}