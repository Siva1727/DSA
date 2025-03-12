class Node {
    int data;
    Node next;
    Node back;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }

    Node(int data, Node next, Node back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }
}

class oper {
    static Node ArrtoDLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = prev.next;
        }
        return head;
    }
    public static Node addatbegining(Node head,int val){
        Node temp=new Node(val,head,null);
        head.back=temp;
        return temp;
    }
    public static Node addbeforetail(Node head , int val){
        if(head.next == null){
            return addatbegining(head,val);
        }
        Node tail=head;
        while(tail.next != null){
            tail=tail.next;
        }
        Node prev =tail.back;
        Node newnode=new Node(val,tail,prev);
        tail.back=newnode;
        prev.next=newnode;
        return head;
    }

    public static Node deletehead(Node head){
        if(head == null || head.next == null)return null;
        Node prev=head;
        head=head.next;
        head.back=null;
        prev.next=null;
        return head;
    }
    public static Node deletetail(Node head){
        if(head == null || head.next == null)return null;
        Node tail = head;
        while(tail.next != null){
            tail=tail.next;
        }
        Node prev=tail.back;
        prev.next=null;
        tail.back=null;
        return head;
    }
    static Node deletekthele(Node head , int k){
        int cnt=0;
        Node temp=head;
        while(temp.next != null){
            cnt++;
            if(cnt == k)break;
            temp=temp.next;
        }
        Node prev = temp.back;
        Node front = temp.next;
        if(prev == null && front == null )return null;
        else if(prev == null)return deletehead(head);
        else if(front == null)return deletetail(head);
        else{
            prev.next = front;
            front.back = prev;
            temp.next = null;
            temp.back = null;
        }
        return head;
    }
    static Node reverse(Node head){
        // Stack<Integer> st=new Stack<>();
        // Node temp = head;
        // while(temp != null){
        //     st.push(temp.data);
        //     temp = temp.next;
        // }
        // temp=head;
        // while(temp != null){
        //     temp.data = st.pop();
        //     temp = temp.next;
        // }
        // return head;
        if(head == null && head.next == null)return head;
        Node current=head;
        while(current != null){
            Node last = current.back;
            current.back = current.next;
            current.next = last;
            head = current;
            current = current.back;
        }
        return head;

    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = oper.ArrtoDLL(arr);
        // head=oper.addatbegining(head,10);
        // head=oper.addbeforetail(head,20);
        // head=oper.deletehead(head);
        // head=oper.deletetail(head);
        // head=oper.deletekthele(head,5);
        head = oper.reverse(head);

        oper.print(head);
    }
}
