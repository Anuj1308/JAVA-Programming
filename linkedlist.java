import java.util.LinkedList;
public class linkedlist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        //step 1
        Node newnode = new Node(data);
        if (head == null){
            head = tail = newnode;
            return;
        }
        //step 2
        newnode.next = head; //link
        //step 3
        head = newnode;
    }

    public void addLast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    /**
     *
     */
    public void print(){
        if (head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data){
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        //i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;

    }

    /**
     * @param key
     * @return
     */
    // public int itrsearch(int key) {
    //     Node temp = head;
    //     int i = 0;
    
    //     while (temp != null) {
    //         if (temp.data == key) { // Change this line to use ==
    //             return i;
    //         }
    //         temp = temp.next;
    //         i++;
    //     }
    //     // Key not found
    //     return -1;
    // }

    // public static void main(String args[]) {
    //     linkedlist li = new linkedlist();
        
    //     li.addFirst(2);
    //     li.addFirst(1);
    //     li.addLast(3);
    //     li.addLast(4);
    //     li.print();

    //     System.out.println(li.itrsearch(3));
    //     System.out.println(li.itrsearch(10));
    // }

    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if (head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1){
            return -1; 
        }

        return idx+1;
    }

    public int recsearch(int key) {
        return helper(head, key);
    }
    
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deletenthfromend(int n){
        //calculate size
        int sz =  0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if (n == sz){
            head = head.next; //remove first
            return ;
        }

        //size - n
        int i = 1;
        int itofind = sz-n;
        Node prev = head;
        while(i<itofind-1){
            prev = prev.next;
            i++;
        } 
        prev.next = prev.next.next;
        return;
    }

    //Slow-fast approach
    public Node findmid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; //slow is mid Node
    }       
    
    public boolean checkpalindrome(){
        if (head == null || head.next == null){
            return true;
        }
        //step 1
        Node midnode = findmid(head);

        //step 2 - reverse 2nd half
        Node prev = null;
        Node curr = midnode;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        } 
        Node right = prev; //right half head
        Node left = head;

        //step3 - check lefft half & right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right =right.next;

        }
        return true;
    }

    // public static void main(String args[]) {
    //     linkedlist li = new linkedlist();
        
    //     li.addLast(2);
    //     li.addLast(1);
    //     li.addLast(1);
    //     li.addLast(2);
    //     li.print();

    //     System.out.println(li.checkpalindrome());
    // }

    
        public static boolean iscycle(){ //floyd's cycle finding algorithm 
            Node slow = head;
            Node fast = head;
    
            while (fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast){
                    return true; //cycle
                }
            }
            return false; //cycle does'nt exists
        }

        public static void removecycle(){
            //detect cycle
            Node slow = head;
            Node fast = head;
            boolean cycle = false;
            while (fast != null && fast.next != null){
                slow  = slow.next;
                fast = fast.next.next;
                if(fast == slow){
                    cycle = true;
                    break;
                }
            }
            if(cycle == false){
                return;
            }

            //find meeting point 
            slow = head;
            Node prev = null; //last node
            while (slow != fast){
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }

            //remove cycle
            prev.next = null;
        }
    
        public void zigzag(){
            //find mid
            Node slow = head;
            Node fast = head.next;
            while(fast != null && fast.next !=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            Node mid = slow;

            //reverse 2nd half
            Node curr = mid.next;
            mid.next = null;
            Node prev = null;
            Node next;

            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node left = head;
            Node right = prev;
            Node nextR, nextL;

            //alternate merge
            while(left != null && right != null){
                nextL = left.next;
                left.next = right;
                nextR = right.next;
                right.next = nextL;

                left = nextL;
                right = nextR;
            }
        }

        public void printL() {
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

        public static void main(String args[]){
            LinkedList ll = new LinkedList();
            ll.addLast(1);
            ll.addLast(2);
            ll.addLast(3);
            ll.addLast(4);
            ll.addLast(5);
            //1->2->3->4->5

            ll.printL();
            ll.zigzag();
            ll.printL();
        }
        
}


