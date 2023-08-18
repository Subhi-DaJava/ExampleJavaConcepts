package com.uyghur.java.algo.queue_310723.tree_node_170823.exemples;

import com.uyghur.java.algo.queue_310723.LinkedListQueue;
import com.uyghur.java.algo.queue_310723.tree_node_170823.tree_node_170823.TreeNode;

import java.util.List;

/**
 *                         1
 *                      /    \
 *                     2        3
 *                   /  \    /    \
 *                  4   5    6     7
 *                / \  / \  / \    / \
 *               8  9 10 11 nl nl nl null null
 *
 * Given the root of a binary tree,
 * return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
 * 1) Input: root = [1,2,3,null,null,4,5]
 * Output: [[1],[2,3],[4,5]]
 * 2) Input: root = [1,2,3,null,null,4,5]
 *  * Output: 1,2,3,4,5
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> layerByLevel(TreeNode root) {
        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(
                new TreeNode(
                        new TreeNode(
                                new TreeNode(8),
                                4,
                                new TreeNode(9)
                        ),
                        2,
                        new TreeNode(
                                new TreeNode(10),
                                5,
                                new TreeNode(11)
                        )
                ),
                1,
                new TreeNode(
                        new TreeNode(6),
                        3,
                        new TreeNode(7)
                )
        );

        LinkedListQueue<TreeNode> treeNodeQueue = new LinkedListQueue<>();

        // add root tree node
        treeNodeQueue.offer(root);

        while (!treeNodeQueue.isEmpty()) {
            TreeNode node = treeNodeQueue.poll();

            System.out.print(node + " "); // toString methode

            if (node.left != null) {
                treeNodeQueue.offer(node.left);
            }
            if (node.right != null) {
                treeNodeQueue.offer(node.right);
            }
        }

    }
}
