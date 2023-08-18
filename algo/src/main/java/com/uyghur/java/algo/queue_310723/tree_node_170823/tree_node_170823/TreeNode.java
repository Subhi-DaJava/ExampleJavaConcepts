package com.uyghur.java.algo.queue_310723.tree_node_170823.tree_node_170823;

public class TreeNode {
    public int value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int value) { this.value = value;}

    public TreeNode(TreeNode left,int value, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}
