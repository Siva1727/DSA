
import java.util.ArrayList;
import java.util.List;

// class TreeNode{
//     int data ;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int data){
//         this.data = data;
//     }
// }
class RootToPathNode{
    public static void main(String[] args) {
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

        //TreeNode k = new TreeNode(8);
        int k = 8;
        List<Integer> ls = new ArrayList<>();
        solve(root , ls , k);
        System.out.println(ls);
    }
    static boolean solve(TreeNode node , List<Integer> ls , int k){
        if(node == null){
            return false ;
        }
        ls.add(node.val);
        if(node.val == k){
            return true ;
        }
        if(solve(node.left , ls, k) || solve(node.right , ls , k)){
            return true;
        }
        ls.remove(ls.size()-1);
        return false;
    }
}