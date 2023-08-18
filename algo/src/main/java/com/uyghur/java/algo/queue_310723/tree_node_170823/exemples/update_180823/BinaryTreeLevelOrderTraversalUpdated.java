package com.uyghur.java.algo.queue_310723.tree_node_170823.exemples.update_180823;

import com.uyghur.java.algo.queue_310723.LinkedListQueue;
import com.uyghur.java.algo.queue_310723.tree_node_170823.tree_node_170823.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *                         1
 *                      /    \
 *                     2        3
 *                   /  \    /    \
 *                  4   5    6     7
 *                / \  / \  / \    / \
 *               8  9 10 11 nl nl nl null null
 * Given the root of a binary tree,
 * return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
 * 1) Input: root = [1,2,3,null,null,4,5]
 * Output: [[1],[2,3],[4,5]]
 * 2) Input: root = [1,2,3,null,null,4,5]
 * Output: 1 2 3 4 5
 * 3) Input: root = [1,2,3,null,null,4,5]
 * Output:
 * 1
 * 2 3
 * 4 5
 */
public class BinaryTreeLevelOrderTraversalUpdated {

    public List<List<Integer>> allLayers(TreeNode root) {

        List<List<Integer>> listByLayer = new ArrayList<>();

        if(root == null) {
            return listByLayer;
        }

        LinkedListQueue<TreeNode> treeNodeQueue = new LinkedListQueue<>();

        // add root tree node
        treeNodeQueue.offer(root);

        int currentNodeNumbers = 1;

        while (!treeNodeQueue.isEmpty()) {
            List<Integer> layerByLever = new ArrayList<>();

            int currentChildNodesNumbers = 0;

            for (int i = 0; i < currentNodeNumbers; i++) {

                TreeNode node = treeNodeQueue.poll();

                layerByLever.add(node.value);

                if (node.left != null) {
                    treeNodeQueue.offer(node.left);
                    currentChildNodesNumbers++;
                }
                if (node.right != null) {
                    treeNodeQueue.offer(node.right);
                    currentChildNodesNumbers++;

                }
            }
            currentNodeNumbers = currentChildNodesNumbers;
            listByLayer.add(layerByLever);
        }
        return listByLayer; // [[1], [2, 3], [4, 5, 6, 7], [8, 9, 10, 11]]

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

        int currentNodeNumbers = 1;

        while (!treeNodeQueue.isEmpty()) {
            int currentChildNodesNumbers = 0;
            for (int i = 0; i < currentNodeNumbers; i++) {

                TreeNode node = treeNodeQueue.poll();

                System.out.print(node + " "); // toString methode

                if (node.left != null) {
                    treeNodeQueue.offer(node.left);
                    currentChildNodesNumbers++;
                }
                if (node.right != null) {
                    treeNodeQueue.offer(node.right);
                    currentChildNodesNumbers++;

                }
            }
            currentNodeNumbers = currentChildNodesNumbers;
            System.out.println();
        }

        System.out.println("***********************************************************");

        BinaryTreeLevelOrderTraversalUpdated binaryTreeLevelOrderTraversalUpdated = new BinaryTreeLevelOrderTraversalUpdated();

        System.out.println(binaryTreeLevelOrderTraversalUpdated.allLayers(root));

        System.out.println("------------------------------------------ With Arrays.toString(list.toArray()) -----------------------------------------------------------");
        String arrayAsString = Arrays.toString(binaryTreeLevelOrderTraversalUpdated.allLayers(root).toArray());
        System.out.println(arrayAsString);

    }
}
