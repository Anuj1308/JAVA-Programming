import java.util.LinkedList;
public class keysearch{
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if (head.data == key){
            return 0;
        }
        int idx = helper(head.next, key)
        if (idx == -1){
            return -1; 
        }

        return idx+1;
    }

    public int recsearch(int key) {
        return helper(head, ket);
    }
    
    public static void main(String args[]) {
        linkedlist li = new linkedlist();
        
        li.addFirst(2);
        li.addFirst(1);
        li.addLast(3);
        li.addLast(4);
        li.print();

        System.out.println(li.recsearch(3));
        System.out.println(li.irecsearch(10));
    }
}
}