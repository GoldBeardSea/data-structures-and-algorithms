package Challenges.Tree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Intersection {

    public static Set treeIntersection(BinaryTree treeOne, BinaryTree treeTwo) {
        if (treeOne.root == null || treeTwo.root == null) {
            System.out.println("List is Empty");
            return null;
        }
        Set<Integer> treeOneSet = new HashSet<>();
        treeOneSet = addToSet(treeOne, treeOneSet);
        Set<Integer> treeTwoSet = new HashSet<>();
        treeTwoSet = addToSet(treeTwo, treeTwoSet);
        Set<Integer> result = new HashSet<>();
        for (Integer setOne : treeOneSet) {
            if (treeTwoSet.contains(setOne)) {
                result.add(setOne);
                System.out.println("Intersection");
            } else {
                System.out.println("Unique");
            }
        }
        return result;
    }

    private static Set addToSet (BinaryTree tree, Set<Integer> treeSet) {
        Queue<TreeNode> treeQueue = new LinkedList<>();
        treeQueue.add(tree.root);
        while (!treeQueue.isEmpty()) {
            TreeNode traversingNode = treeQueue.poll();
            Integer addNodeValue = (Integer) traversingNode.data;
            treeSet.add(addNodeValue);

            if (traversingNode.left != null) {
                treeQueue.add(traversingNode.left);
            }
            if (traversingNode.right != null) {
                treeQueue.add(traversingNode.right);
            }
        }
        return treeSet;
    }
}
