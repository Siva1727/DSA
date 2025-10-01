class BT{
    public static void main(String[] a){
        Node node1 = new Node(1);
        node1.left = new Node(2);
        node1.right = new Node(3);

        // Adding more nodes
        node1.left.left = new Node(4);
        node1.left.right = new Node(5);

        node1.right.left = new Node(6);
        node1.right.right = new Node(7);

        // Adding one more level for variety
        node1.left.left.left = new Node(8);
        node1.left.left.right = new Node(9);

        inOrder(node1);
        System.out.println("");
        preOrder(node1);
        System.out.println("");
        postOrder(node1);
    }

    static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data+"-> ");
        inOrder(root.right);
    }
    static void preOrder(Node root){
        if(root == null) return;
        System.out.print(root.data+"-> ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+"-> ");
    }
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}