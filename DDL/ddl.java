public class ddl {
    static Node head = null;
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6};
        for (int data : arr) {
            insertAtEnd(data);
        }
        print();
    }
    static void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    static void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("null ");
    }
       
}
class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
