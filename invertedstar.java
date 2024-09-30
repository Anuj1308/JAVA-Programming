public class invertedstar{
    public static void main(String args[]){
        for (int i = 1; i<=5; i++){
            for(int n = 1; n<= 5-i+1; n++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}