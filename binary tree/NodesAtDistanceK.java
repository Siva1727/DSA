import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class NodesAtDistanceK {
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

        System.out.println(solve(root ,root.left,2));
    }

    static List<Integer> solve(TreeNode root , TreeNode target , int k){
        Map<TreeNode , TreeNode>parent = new HashMap<>();
        MarkParent(root,parent);
        Map<TreeNode,Boolean> visted = new HashMap<>();
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(target);
        visted.put(target,true);
        int distance = 0;
        while(!qu.isEmpty()){
            if(distance == k){
                break;
            }
            distance++;
            int size = qu.size();
            for(int i=0;i<size;i++){
                TreeNode node = qu.remove();
                if(node.left != null && visted.get(node.left) == null){
                    qu.add(node.left);
                    visted.put(node.left,true);
                }
                if(node.right != null && visted.get(node.right) == null){
                    qu.add(node.right);
                    visted.put(node.right,true);
                }
                if(parent.get(node) != null && visted.get(parent.get(node)) == null){
                    qu.add(parent.get(node));
                    visted.put(parent.get(node),true);
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
            while(!qu.isEmpty()){
                ans.add(qu.remove().val);
            }
            return ans ;
    }

    static void MarkParent(TreeNode node , Map<TreeNode , TreeNode>parent){
        Queue<TreeNode> qu = new LinkedList<TreeNode>();
        qu.add(node);
        while(!qu.isEmpty()){
            TreeNode temp = qu.remove();
            if(temp.left != null){
                qu.add(temp.left);
                parent.put(temp.left , temp);
            }
            if(temp.right != null){
                qu.add(temp.right);
                parent.put(temp.right , temp);
            }
        }
    }
}
