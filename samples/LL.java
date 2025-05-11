
class Node {

    int data;//0
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class LL {
    static Node thala = null;
    static Node convertArr(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    static Node insertmid(Node head) {
        Node temp = head;

        while (temp.data + 1 == temp.next.data) {
            temp = temp.next;
        }

        Node newn = new Node(temp.data + 1);
        Node next_node = temp.next;
        temp.next = newn;
        newn.next = next_node;
        return head;
    }

    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println(" Null");
    }

    static Node insertval(Node head, int val) {
        Node temp = new Node(val, head);
        return temp;
    }

    static Node inserttail(Node head, int val) {
        Node newnode = new Node(val);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        return head;
    }


    static void printRec(Node root) {
        Node node = root;
        if (node == null) {
            return;
        }
        System.out.print(node.data + " -> ");
        printRec(node.next);
    }

    static Node reverse(Node head) {
        Node temp = head;
        Node prevN = null;
        Node nextN = null;
        while (temp!= null) {
            nextN = temp.next;
            temp.next = prevN;
            prevN = temp;
            temp = nextN;
        }
        return prevN;
        // Node prev = null;
        // Node temp = head;
        // Node nxt = temp.next;
        // while(temp!= null){
        //     temp.next = prev ;
        //     prev = temp;
        //     temp = nxt;
        //     nxt = nxt.next;
        // }
        // //temp.next = prev;
        // return prev;
    }
    static Node OddEven(Node head){
        Node odd = null;
        Node even = null;
        Node temp = head;
        Node tempodd = odd;
        Node tempeven = even;
        while(temp != null){
            if(temp.data %2 == 0){
                if(even == null){
                    even = tempeven = temp;
                }
                else{
                    even.next = temp;
                    even = even.next;
                }
            }
            else{
                if(odd == null){
                    odd = tempodd = temp;
                }
                else{
                    odd.next = temp;
                    odd = odd.next;
                } 
            }
            temp = temp.next;
        }
        odd = tempeven;
        return tempodd;
    }
    static void InsertSort(Node node){
        if(thala == null || thala.data >= node.data){
            node.next = thala;
            thala = node;
        }
        
        else{
            Node temp = thala;
            while(temp.next != null && temp.next.data < node.data){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
        //return thala;
    } 

    public static void main(String[] args) {
        int arr[] = {2,7,5,4,3,1,6};
        Node head = convertArr(arr);
        //Node head2 = insertmid(head);
        //head=insertval(head,10);
        //head = inserttail(head,6);
        //printRec(head);
        //System.out.println("null");
        //head = reverse(head);
        // print(head);
        // head = OddEven(head);
        for(int i : arr){
            Node node = new Node(i);
            InsertSort(node);
        }
        print(thala);
    }
}
