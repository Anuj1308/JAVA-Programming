import java.util.ArrayList;

public class pairsum {
    //brute force
    public static boolean pairsum1(ArrayList<Integer> list, int target){
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if (list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean pairsum2(ArrayList<Integer> list, int target){
        int bp = -1; //breaking point
        int n = list.size();
        for (int i=0; i<list.size(); i++) {
            if(list.get(i) > list.get(i+1)){
                //breaking point
                bp = 1;
                break;
            }
        }
        int lp = bp + 1; //smallest
        int rp = bp; //smallest

        while(lp !=rp){
            //case 1
            if (list.get(lp) + list.get(rp) == target){
                return true;
            }
            //case 2
            if(list.get(lp) + list.get(rp) < target) {
                lp = (lp+1) % n;
            }
            else{ //case 3
            rp  = (n+rp-1) %n;
            }
        }
        return false;
    }

    public static void main (String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;
        System.out.println(pairsum2(list, target));
    }
}
