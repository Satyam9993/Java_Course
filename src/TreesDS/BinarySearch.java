package TreesDS;

import org.w3c.dom.Node;

public class BinarySearch {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
            left = null;
            right = null;
        }
    }

    static TreeNode insertNode(TreeNode root, int val){
        if(root == null){
            return  new TreeNode(val);
        }

        if(root.val > val){
            root.left = insertNode(root.left, val);
        }else{
            root.right = insertNode(root.right, val);
        }

        return root;
    }
    static void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        int[] a = {1, 2,3, 4, 5};
        TreeNode root = null;
        for(int i = 0; i < a.length; i++){
            root = insertNode(root, a[i]);
        }
        inOrder(root);
    }
}
