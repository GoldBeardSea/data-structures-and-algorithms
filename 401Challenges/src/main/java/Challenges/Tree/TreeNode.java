package Challenges.Tree;

public class TreeNode <T> {
    protected T data;
    protected TreeNode <T> left;
    protected TreeNode <T> right;

    public TreeNode(T value) {
        this.data = value;
        this.left = null;
        this.right = null;
    }

    public T getData() {
        return data;
    }

    public TreeNode getLeft() {
        return this.left;
    }

    public TreeNode getRight() {
        return this.right;
    }

    public String toString() {
        return "" + this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
