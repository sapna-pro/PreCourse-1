class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
    int top;
  
    boolean isEmpty() 
    { 
        //Write your code here 
        return (top == -1);
    } 

    Stack() 
    { 
        this.top = -1; 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(!isFull()){
            top++;
            a[top] = x;
            System.out.println(Element pushed is:+ x);
        }else{
            System.out.println("stack is full");
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(!isEmpty()){
            int var = top;
            top--;
            return a[var];
        }else{
            System.out.println("stack is empty");
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if(!isEmpty()){
            return a[top];
        }else{
            System.out.println("stack is empty");
            return -1;
        }
    } 

    boolean isFull(){
        return (MAX-1 == top);
    }
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
