package Challenges.Tree;

public class BinarySearchTree extends BinaryTree {


    protected TreeNode <Integer> root;

    public BinarySearchTree() {
        this.root = null;
    }

    @Override
    public TreeNode<Integer> getRoot() {
        return root;
    }

    public void add(Integer value) {
        if (this.root == null) {
            this.root = new TreeNode(value);
            return;
        }
        this.add(value, this.root);
    }

    private void add(Integer value, TreeNode current) {
        if (current.left == null && value <= (Integer) current.data) {
            current.left = new TreeNode(value);
            return;
        }
        if (current.right == null && value > (Integer) current.data) {
            current.right = new TreeNode(value);
            return;
        }
        if (value <= (Integer) current.data) {
            add(value, current.left);
        } else if (value > (Integer) current.data) {
            add(value, current.right);
        }
    }

    public boolean contains(int value) {
        return this.contains(value, this.root);
    }

    private boolean contains(Integer value, TreeNode node) {
        if (node == null) {
            return false;
        }

        if (node.data == value) {
            return true;
        }

        boolean wasOnLeft = contains(value, node.left);
        boolean wasOnRight = contains(value, node.right);
        return wasOnLeft || wasOnRight;
    }
}
