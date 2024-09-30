public class arraypairs{
    public static void pairs(int numbers[]){
        int totalpairs = 0;
        for (int i = 0; i < numbers.length; i++){
            
            int x = numbers[i];
            for(int j =i +1; j<numbers.length; j++ ){
                System.out.print("(" + x + "," + numbers[j] + ")");
                totalpairs++;
            }
            System.out.println();
            
        }
        System.out.print("Total number of pairs: " + totalpairs);
    }

    public static void main(String args[]){
        int numbers[] = {1 ,2 ,3 ,4 ,5 ,6 };
        pairs(numbers);
    }
}