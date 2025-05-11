public class ChildrenSumProperty {
    public static void main(String[] args) {

        //      50
        //     /  \
        //    7    2
        //   / \    \
        //  3   5    1
  
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(7);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);

        root.right.right = new TreeNode(1);
        
        System.out.println("Before Children Sum Property:");
        print(root);
        System.out.println();

        solve(root);

        System.out.println("After Children Sum Property:");
        print(root);
        System.out.println();


    }

    static void solve(TreeNode node){
        if(node == null){
            return ;
        }
        int child = 0;
        if(node.left != null)child += node.left.val;
        if(node.right != null)child += node.right.val;

        if( child >= node.val){
            node.val = child ;
        }
        else{
            if(node.left != null)node.left.val = node.val;
            if(node.right != null)node.right.val = node.val;
        }
        solve(node.left);
        solve(node.right);
        
        int tot = 0;
        if(node.left != null) tot += node.left.val;
        if(node.right != null)tot += node.right.val;

        if(node.left != null || node.right != null) node.val = tot;
        
    }

    static void print(TreeNode node) {
        if (node == null) return;
        print(node.left);
        System.out.print(node.val + " ");
        print(node.right);
    }
    
}
