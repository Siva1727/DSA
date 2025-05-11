import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//                                                 boundary of binary tree  -  leetcodee : 545
class TreeNode{
    int val ;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
class boundary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         // Example 1: Creating the tree
        //       1
        //      / \
        //     2   3
        //    / \   \
        //   4   5   6
        //      / \
        //     7   8

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(8);

        List<Integer> ans = new ArrayList<>();
        if( isLeaf(root) == false ) ans.add(root.val);

        leftNodes(root , ans);
        leafNodes(root , ans);
        rightNodes(root , ans);
        
        System.out.println(ans);
    }

    static boolean isLeaf(TreeNode node) {
        return node != null && node.left == null && node.right == null;
    }

    static void leftNodes(TreeNode root , List<Integer> ans){
        TreeNode curr = root.left ;
        while(curr != null){
            if(!isLeaf(curr))ans.add(curr.val);
            if(curr.left != null)curr = curr.left;
            else curr = curr.right;
        }
    }

    static void rightNodes(TreeNode root , List<Integer> ans){
        TreeNode curr = root.right;
        List<Integer> temp = new ArrayList<>();
        while(curr != null){
            if(!isLeaf(curr))temp.add(curr.val);
            if(curr.right != null)curr = curr.right;
            else curr = curr.right;
        }
        for(int i = temp.size()-1 ; i>=0 ;i--){
            ans.add(temp.get(i));
        }
    }

    static void leafNodes(TreeNode root , List<Integer> ans){
        if(isLeaf(root)){
            ans.add(root.val);
        }
        if(root.left != null)leafNodes(root.left,ans);
        if(root.right != null)leafNodes(root.right,ans);

    }
}