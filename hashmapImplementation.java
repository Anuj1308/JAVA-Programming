import java.util.*;
public class hashmapImplementation {
    static class HashMap<K,V> { //generic
        private class Node{
            K key;
            V value;

            public Node (K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        
        private int size;//n
        private LinkedList<Node> buckets[]; //N

        @SuppressWarnings("unchecked")
        public HashMap(){
            public void put(K key, V value){
                    this.size = 0;
                    this.bucket = new LinkedList[4];
                    for(int i = 0; i<4; i++){
                        this.buckets[i]= new LinkedList<>();
                    }
                }

                public void 
        }
    }
}
