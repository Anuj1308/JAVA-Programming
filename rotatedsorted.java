public class rotatedsorted {
    public static int search (int arr[], int tar, int si, int ei){
        if (si > ei){
            return -1;
        }
        //kaam
        int mid = si + (ei -si)/2; // (si + ei)/2

        // FOUND
        if (arr[mid] == tar){
            return mid;
        }

        //case 1 : on L1
        if (arr[si] <= arr[mid]){
            //case A : left
            if (arr[si] <= tar && tar<= arr[mid]){
                return search(arr, tar, si, mid-1);
            }
            // case B : right
            else{
                return search(arr, tar, mid+1, ei);
            }
        }
        //case 2: on L2
        else{
            if (arr[mid]<= arr[ei]){
            //case C: right
            if (arr[mid] <= tar && tar<=arr[ei]){
                return search(arr, tar, mid+1, ei);
            }
            //case D: left
            else{
                return search(arr, tar, si, mid-1);
            }
        }
        }
        return -1; // Added a default return value
    }
    public static void main(String args[]){
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0; //output --> 4
        int taridx = search(arr, target, 0, arr.length-1);
        System.out.println(taridx);
    }
    
}
