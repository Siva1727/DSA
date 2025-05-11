import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class TreeNode{
    int val ;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}

class Pair{
    TreeNode node;
    int ind ;
    Pair(TreeNode node , int ind){
        this.node = node;
        this.ind = ind;
    }
}
public class BottomView {
    public static void main(String[] args) {
         // Example 1: Creating the tree
        //       1
        //      / \
        //     2    3
        //    / \  / \
        //   4   5 6  7
        //      / \
        //     8   9

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.left.right.left = new TreeNode(8);
        root.left.right.right = new TreeNode(9);

        System.out.print(solve(root));
    }
    static List<Integer> solve(TreeNode root ){
        List<Integer> ans = new ArrayList<>();
        if(root == null)return ans;
        Map<Integer,Integer> map = new TreeMap<>();
        Queue<Pair> qu = new LinkedList<>();
        qu.add(new Pair(root , 0));

        while(!qu.isEmpty()) {
            Pair p = qu.remove();
            TreeNode node = p.node;
            int ind = p.ind;
            map.put(ind , node.val);
            if(node.left != null) qu.add(new Pair(node.left,ind-1));
            if(node.right != null) qu.add(new Pair(node.right,ind+1));
        }

        for(int val : map.values()){
            ans.add(val);
        }
        return ans;
    }
}
