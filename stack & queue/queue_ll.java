
class Node{
    int data;
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
class Queue{
    Node st = null;
    Node end = null;
    int size = 0;
    public void add(int x){
        Node newNode = new Node(x);
        if(st == null){
            st = end = newNode;
        }
        else{
            end.next = newNode;
            end = newNode;
        }
        size++;
    }
    public int remove(){
        if(st == null){
            System.out.println("Queue is empty");
            return -1;
        }
        int removedData = st.data;
        st = st.next;
        size--;
        return removedData;
    }
    public int peek(){
        if(st == null){
            System.out.println("Queue is empty");
            return -1;
        }
        return end.data;
    }
    public boolean isEmpty(){
        return st == null ;
    }
    public int Size(){
        return size;
    }
    public void display(){
        if(st == null){
            System.out.println("Queue is empty");
            return ;
        }
        Node temp = st;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
        //return;
    }

}

public class queue_ll {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.display();

        System.out.println("Peek : " + queue.peek());

        System.out.println("pooped : " + queue.remove());
        queue.display();

        System.out.println("Queue size: " + queue.Size());
    }
}
