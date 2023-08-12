class MyStack {

    Queue <Integer> q1; 
    public MyStack() {
        q1= new LinkedList<Integer>();

    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        int size=q1.size();
        for(int i=0;i<q1.size()-1;i++)
        {
              int x=q1.remove();
              q1.add(x);
        }
        return q1.remove();
    }
    
    public int top() {

        int size=q1.size();
        for(int i=0;i<q1.size()-1;i++)
        {
              int x=q1.remove();
              q1.add(x);
        }
        int ans= q1.peek();
        int x=q1.remove();
        q1.add(x);
        return ans;


        
    }
    
    public boolean empty() {
        if(q1.size()==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */