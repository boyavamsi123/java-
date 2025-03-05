public  class MaxValueFinder{
    public static void main(String[] args) {
        int[] arr = {2,5,1,9,6};

        int max = arr[0];   
        int index = 0;

        for(int i=1; i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        System.out.println("value - " + max + "& index - " + index); //value - 9& index - 3
    }
}