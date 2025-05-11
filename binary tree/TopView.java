import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
//import java.util.*;

class TreeNode{
    int val ;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
class Pair {
    TreeNode node;
    int ind;
    Pair(TreeNode node, int ind) {
        this.node = node;
        this.ind = ind;
    }
}

class TopView {
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

        List<Integer> ans = new ArrayList<>();

        // if(root == null ) {

        // }
        Map<Integer,Integer> map = new TreeMap<>();
        //Map<Integer,Integer> pair = new TreeMap<>();
        
        Queue<Pair> qu = new LinkedList<>();
        qu.add(new Pair(root,0));
        while(!qu.isEmpty()){
            Pair p = qu.remove();
            int d = p.ind;
            TreeNode node = p.node;
            //if(map.get(d) == null)map.put(d,node.val);
            if(!map.containsKey(d))map.put(d,node.val);
            if(node.left != null) qu.add(new Pair(node.left,d-1));
            if(node.right != null) qu.add(new Pair(node.right,d+1));
        }
        // for(Map.Entry<Integer,Integer> mp : map.entrySet()){
        //     ans.add(mp.getValue());
        // }
        // System.out.println(ans);
        for (int val : map.values()) {
            ans.add(val);
        }
        //System.out.println(map.getKey(-1));

        System.out.println(ans);

    }
}
