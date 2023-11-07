package main.DSA.trees;

import java.util.*;

public class BinaryTree {
    private class TreeNode {
        int val;
        public TreeNode(int val) {
            this.val = val;
        }
        TreeNode right;
        TreeNode left;
    }
    TreeNode root;

    public void add(int data){
        root = add(root, data);
    }

    public TreeNode add(TreeNode root, int data){
        if(root == null){
            root = new TreeNode(data);
            return root;
        }
        if(root.val > data){
            root.left = add(root.left, data);
        }else if(root.val < data){
            root.right = add(root.right, data);
        }
        return root;
    }

    public void inOrder(){
        inOrderTraverse(root);
    }

    public void inOrderTraverse(TreeNode root){
        if(root == null){
            return;
        }
        inOrderTraverse(root.left);
        System.out.print(root.val + "---->");
        inOrderTraverse(root.right);
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add( 45);
        bt.add( 10);
        bt.add( 7);
        bt.add( 90);
        bt.add( 12);
        bt.add( 50);
        bt.add( 13);
        bt.add( 39);
        bt.add( 57);
        //bt.inOrder();
       bt.levelOrder();
    }

    private void levelOrder() {
        System.out.println( levelOrderTraversal(root));
    }

    /*
    * Next challenges:
Validate Binary Search Tree
Binary Search Tree Iterator
Kth Smallest Element in a BST
Closest Binary Search Tree Value II
Inorder Successor in BST
Convert Binary Search Tree to Sorted Doubly Linked List
Minimum Distance Between BST Nodes
    * */
    public int findSecondMin(TreeNode root){
        return -1;
    }

    public List<List<Integer>> levelOrderTraversal(TreeNode root){ // which is AKA BFS
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (queue.isEmpty()){
            int queueSize = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < queueSize; i++) {
                    TreeNode temp = queue.poll();
                    if(temp != null){  // @todo at this getting null pointer exception
                        list.add(temp.val);
                        queue.add(temp.left);
                        queue.add(temp.right);
                    }
            }
            if(list != null)
                result.add(list);
        }
        return result;
    }


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, inorder, 0, inorder.length - 1, 0);
    }

    private TreeNode buildTree(int[] preorder, int[] inorder, int start, int end, int index) {
        if (start > end) return null;
        TreeNode root = new TreeNode(preorder[index]);

        int inIndex = start;
        while (preorder[index] != inorder[inIndex]) inIndex++; // if we use map to store inorder values then no  need of using this while loop
        // inIndex = map.get(preorder[index]);

        root.left = buildTree(preorder, inorder, start, inIndex - 1, index + 1);
        root.right = buildTree(preorder, inorder, inIndex + 1, end, index + inIndex - start + 1);

        return root;
    }
    Map<Integer, Integer> map = new HashMap();

    public TreeNode buildTreeWithMap(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++)
            map.put(inorder[i], i);
        return buildTree(preorder, inorder, 0, inorder.length - 1, 0);
    }



}
