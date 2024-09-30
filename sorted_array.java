public class sorted_array {
    public static boolean sorted (int arr[], int i){
        if (i == arr.length-1){
            return true;
        }
        if (arr[i] > arr[i+1]){
            return false;
        }
        return sorted(arr, i+1);
    }

    public static void main(String args[]){
        int n[] = {1, 2, 3, 4, 5, 6};
        System.out.println(sorted(n, 0));

    }
}
