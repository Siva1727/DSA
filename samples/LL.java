
class Node{
    int data;//0
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    Node(int data , Node next){
        this.data=data;
        this.next=next;
    }
}
class LL{
    
    static Node convertArr(int[]arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }

    static Node insertmid(Node head){
        Node temp = head;
     
            while( temp.data+1 == temp.next.data){
                temp=temp.next;
            }
       
            Node newn= new Node(temp.data+1);
            Node next_node = temp.next;
            temp.next = newn;
            newn.next = next_node;          
        return head;
    }
    static void print(Node head){
        Node temp=head;
        while(temp !=null){
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.println(" Null");
    }
    static Node insertval(Node head,int val){
        Node temp=new Node(val,head);
        return temp;
    }
    static Node inserttail(Node head,int val){
        Node newnode=new Node(val);
        Node temp=head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=newnode;
        return head;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        Node head = convertArr(arr);
        Node head2 = insertmid(head);
        // head=insertval(head,10);
        head = inserttail(head,6);
        print(head);        
    }
}