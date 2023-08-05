class Node{
    int value;
    int min;
    Node(int value,int min)
    {
        this.value=value;
        this.min=min;
    }
}
class MinStack {

    ArrayList<Node> al;
    int top;
    public MinStack() {
       al=new ArrayList<Node>();
       top=-1;
        
    }
    
    public void push(int val) {
        if(top==-1)
        {
            Node x =new Node(val,val);
            al.add(x);
        }
        else
        {
            int t=al.get(top).min;
            if(t<val)
            {
                Node x =new Node(val,t);
                al.add(x);
            }
            else
            {
                Node x=new Node(val,val);
                al.add(x);
            }
        }
        top++;
    }
    
    public void pop() {

    
       
         al.remove(top);
         top--;
       
       
        
    }
    
    public int top() {
       
        return al.get(top).value;
        
        
    }
    
    public int getMin() {
       
        return al.get(top).min;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */