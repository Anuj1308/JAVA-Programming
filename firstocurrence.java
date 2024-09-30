public class firstocurrence {
    public static int fO(int arr[], int key, int i){
        if (i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return fO(arr, key, i+1);
    }

    public static void main (String args[]){
        int arr[] = {8, 3, 6, 7, 10, 2, 5, 3, 9};
        System.out.println(fO(arr, 5, 0));
    }
}
