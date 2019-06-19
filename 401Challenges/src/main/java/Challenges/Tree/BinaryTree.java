package Challenges.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree <T> {

    protected TreeNode <T> root;

    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(T value) {
        this.root = new TreeNode<>(value);
    }

    public TreeNode getRoot() {
        return root;
    }
    public void setRoot(TreeNode<T> root) {
        this.root = root;
    }

    public ArrayList preOrder() {
        ArrayList loaded = new ArrayList();
        return preOrder(loaded, this.root);
    }

    private ArrayList preOrder(ArrayList list, TreeNode current) {
        if (current == null) {
            return list;
        }

        list.add(current.data);
        preOrder(list, current.left);
        preOrder(list, current.right);

        return list;
    }

    public ArrayList inOrder() {
        ArrayList loaded = new ArrayList();
        return inOrder(loaded, this.root);
    }

    private ArrayList inOrder(ArrayList list, TreeNode current) {
        if (current == null) {
            return list;
        }

        inOrder(list, current.left);
        list.add(current.data);
        inOrder(list, current.right);

        return list;
    }

    public ArrayList postOrder() {
        ArrayList loaded = new ArrayList();
        return postOrder(loaded, this.root);
    }

    private ArrayList postOrder(ArrayList list, TreeNode current) {
        if (current == null) {
            return list;
        }

        preOrder(list, current.left);
        preOrder(list, current.right);
        list.add(current.data);

        return list;
    }

    public int size() {
        return size(root);
    }

    private int size(TreeNode treeNode) {
        int result;
        if (treeNode == null) {
            return 0;
        }
        else {
            result = (size(treeNode.left) + 1 + size(treeNode.right));
            return result;
        }
    }

    public ArrayList breadthFirstTraversal() {
        if (this.root == null) {
            System.out.println("List is Empty");
            return null;
        }
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(root);
        ArrayList arrayList = new ArrayList();
        while (!treeNodeQueue.isEmpty()) {
            TreeNode traversingNode = treeNodeQueue.poll();
            arrayList.add(traversingNode.data);
            System.out.print(traversingNode.getData() + " ");

            if (traversingNode.left != null) {
                treeNodeQueue.add(traversingNode.left);
            }
            if (traversingNode.right != null) {
                treeNodeQueue.add(traversingNode.right);
            }
        }
        return arrayList;
    }
}
