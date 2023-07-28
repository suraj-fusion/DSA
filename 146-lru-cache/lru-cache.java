class LRUCache {

    HashMap<Integer,Node> hm ;
    int capacity;
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        hm=new HashMap<>();
        this.capacity=capacity;
        
    }
    
   public int get(int key) {
    if (!hm.containsKey(key)) {
        return -1;
    } else {
        Node temp = hm.get(key);
        if (temp != tail) {
            if (temp == head) {
                head = head.next;
            } else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
            tail.next = temp;
            temp.prev = tail;
            temp.next = null;
            tail = temp;
        }
        return temp.value;
    }
}

    
    public void put(int key, int value) {
        int ans=get(key);
        if(ans==-1)  //key doesnt exist
        {
        
          if(capacity!=0)
          {
             Node temp=new Node(key,value);
             if(head==null)
             {
                 head=temp;
                 tail=head;
               
                
             }
           else
             {
                 tail.next=temp;
                 temp.prev=tail;
                 tail=temp;
                
             }
             capacity--;
             hm.put(key,temp);

         }
          else
           {
                hm.remove(head.key);

                Node temp=new Node(key,value);
                tail.next=temp;
                temp.prev=tail;
                tail=temp;
                Node tempnext=head.next;
               
                if(tempnext!=null)
                {
                    tempnext.prev=null;
                    head.next=null;
                   
                }
                head=tempnext;
                hm.put(key,temp);
           }
        }
        else //key exists
        {
               Node temp=hm.get(key);
               temp.value=value;
        }

        
    }
}

class Node{
    
     Node prev;
     int key;
     int value;
     Node next;
     Node(int key,int value)
     {
          this.value=value;
          this.key=key;
          prev=null;
          next=null;
          
     } 
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */