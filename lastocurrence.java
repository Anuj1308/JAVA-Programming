public class lastocurrence {
    public static int lO(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isfound = lO(arr, key, i+1);
        if (isfound == -1 && arr[i] == key){
            return i;
        }
        return isfound;
    }

    public static void main (String args[]){
        int arr[] = {8, 3, 6, 7, 10, 2, 5, 3, 9};
        System.out.println(lO(arr, 3, 0));
    }
}
