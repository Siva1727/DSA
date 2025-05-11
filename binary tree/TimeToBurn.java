
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class TimeToBurn{
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

        System.out.println(solve(root , 2));
    }
    static int solve(TreeNode root , int target){
        Map<TreeNode,TreeNode>parent = new HashMap<>();
        TreeNode k = setParent(root , target , parent);
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(k);
        Set<TreeNode> visitedSet = new HashSet<>();
        visitedSet.add(k);
        int time = 0;
        while(!qu.isEmpty()){
            int size = qu.size();
            int f = -1 ;
            for(int i=0;i<size;i++){
                TreeNode temp = qu.remove();
                if(temp.left != null && !visitedSet.contains(temp.left)){
                    visitedSet.add(temp.left);
                    qu.add(temp.left);
                    f = 1;
                }
                if(temp.right != null && !visitedSet.contains(temp.right)){
                    visitedSet.add(temp.right);
                    qu.add(temp.right);
                    f = 1;
                }
                if(parent.get(temp) != null && !visitedSet.contains(parent.get(temp))){
                    visitedSet.add(parent.get(temp));
                    qu.add(parent.get(temp));
                    f = 1;
                }
            }
            if(f == 1){
                time++;
            }
        } 
        return time ;
    }

    static TreeNode setParent(TreeNode node , int target, Map<TreeNode,TreeNode>parent){
        TreeNode k = null;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(node);
        while(!qu.isEmpty()){
            TreeNode temp = qu.remove();
            if(temp.val == target){
                k = temp;
            }
            if(temp.left != null){
                qu.add(temp.left);
                parent.put(temp.left , temp);
            }
            if(temp.right != null){
                qu.add(temp.right);
                parent.put(temp.right , temp);
            }
        }
        return k ;
    }
}