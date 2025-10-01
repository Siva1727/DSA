import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class ceil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode root = null;

        System.out.print("Enter the number of nodes in the BST: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " values for the BST:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            root = insert(root, value);
        }

        int k = 8;
        int ceil = ceil(root,k);
        System.out.println("Ceil of "+k+" : "+ceil);

        int floor= floor(root,k);
        System.out.println("Floor of "+k+" : "+floor);
    }
    static int ceil(TreeNode root , int k){
        int ceil = -1;
        while(root != null){
            if(root.val == k){
                return k;
            }
            else if(root.val > k){
                ceil = root.val;
                root = root.left;
            }
            else{
                root = root.right;
            }
        }
        return ceil;
    }
    static int floor(TreeNode root , int k){
        int floor = -1;
        while(root != null){
            if(root.val == k){
                floor = root.val;
                return floor;
            }
            else if(root.val > k){
                root = root.left;
            }
            else{
                floor = root.val;
                root =  root.right;
            }
        }
        return floor;
    }
    public static TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }
        return root;
    }
    static void print(TreeNode root){
        
    }
}

