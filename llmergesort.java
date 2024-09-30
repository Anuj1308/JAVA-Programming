import java.util.*;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class llmergesort {
    Node head; 
    public Node getmid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //mid node = slow
    }
    public Node merge(Node head1, Node head2){
        Node mergedll = new Node(-1);
        Node temp = mergedll;
        while (head1!=null && head2!=null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next; 
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;                
            }
        }
        while(head1 != null){
            temp = head1;
            head1 = head1.next;
            temp = temp.next; 
        }
        while (head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedll.next;
    }

    public Node mergesort(Node head){
        //base case
        if(head == null || head.next == null){
            return head;
        }

        //find mid
        Node mid = getmid(head);

        //left and right mergesort
        Node righthead = mid.next;
        mid.next = null;
        Node newleft = mergesort(head);
        Node newright = mergesort(righthead);

        //merge
        head = merge(newleft, newright);
        return head;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            current = current.next;
            if (current != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    public static void main (String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        //5->4->3->2->1

        ll.print();
        ll.head = ll.mergesort(ll.head);
        ll.print();
    }
}
