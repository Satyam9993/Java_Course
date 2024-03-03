package CollectionData;

public class TreeCollection {

    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
            left = null;
            right = null;
        }
    }

    static class BinaryTree {
        static int index = -1;
        public static Node BuildTree (int[] n){
            index++;
            if(n[index] == -1){
                return  null;
            }

            Node newNode = new Node(n[index]);
            newNode.left = BuildTree(n);
            newNode.right = BuildTree(n);
            return newNode;
        }

        public static void preOrder(Node n){
            if(n == null){
                System.out.print(null+" ");
                return;
            }
            System.out.print(n.val+" ");
            preOrder(n.left);
            preOrder(n.right);
        }

        public static void inOrder(Node n){
            if(n == null){
                System.out.print(null+" ");
                return;
            }
            preOrder(n.left);
            System.out.print(n.val+" ");
            preOrder(n.right);
        }

        public static void postOrder(Node n){
            if(n == null){
                System.out.print(null+" ");
                return;
            }
            preOrder(n.left);
            preOrder(n.right);
            System.out.print(n.val+" ");    
        }

    }

    public static void main(String[] args) {

        int[] n = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree t = new BinaryTree();
        Node root = t.BuildTree(n);
        t.preOrder(root);
        System.out.println();
        t.inOrder(root);
        System.out.println();
        t.postOrder(root);

    }
}




// Find Largest Value in Each Tree Row
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
//class Solution {
//    public List<Integer> largestValues(TreeNode root) {
//        List<Integer> ans = new ArrayList<>();
//        if(root == null){
//            return ans;
//        }
//        Queue<TreeNode> q= new LinkedList<>();
//        q.add(root);
//        q.add(null);
//
//        while(!q.isEmpty()){
//            int max = Integer.MIN_VALUE;
//
//            while(q.peek() != null){
//                TreeNode t = q.remove();
//                int val = t.val;
//
//                if(max < val){
//                    max = val;
//                }
//                if(t.left!=null){
//                    q.add(t.left);
//                }
//
//                if(t.right!=null){
//                    q.add(t.right);
//                }
//            }
//            ans.add(max);
//            if(q.peek() == null){
//                q.remove();
//                if(q.isEmpty()){
//                    return ans;
//                }
//                q.add(null);
//            }
//        }
//
//        return ans;
//    }
//}
