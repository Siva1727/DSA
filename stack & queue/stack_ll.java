class Node{
    int data ;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
}
class Stack{
    Node top = null;
    int size = 0;
    public void push(int x){
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        size++; 
    }
    public int pop(){
        if(size == 0){
            System.out.println("Stack is empty");
            return -1;
        }
        Node newNode = top;
        top = top.next;
        size -- ;
        return newNode.data;
    }
    public int peek(){
        if(size == 0){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
    public int Size(){
        return size;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public void display(){
        if(size == 0){
            System.out.println("Stack is empty");
            return ;
        }
        Node temp = top;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    // public static void main(String[] args) {
        
    // }
}
public class stack_ll {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.display();
        int pop = stack.pop();
        System.out.println("Popped "+ pop);
        System.out.println("Peek "+ stack.peek());
        stack.display();
        int pop2 = stack.pop();
        System.out.println("Popped "+ pop2);
        stack.display();
    }
}
