package Challenges.Tree;

public class FizzBuzzTree extends BinaryTree{

    protected TreeNode <Object> root;

    public FizzBuzzTree() {
        this.root = null;
    }

    public FizzBuzzTree(Object root) {
        this.root = new TreeNode<>(root);
    }

    private void fizzBuzz(TreeNode fizzyTreeNode) {
        if (fizzyTreeNode == null) {
            return;
        }
        if ((int) fizzyTreeNode.getData() % 15 == 0) {
            System.out.print("FizzBuzz" + " ");
            fizzyTreeNode.setData("FizzBuzz");
        } else if ((int) fizzyTreeNode.getData() % 3 == 0) {
            System.out.print("Fizz" + " ");
            fizzyTreeNode.setData("Fizz");
        } else if ((int) fizzyTreeNode.getData() % 5 == 0) {
            System.out.print("Buzz" + " ");
            fizzyTreeNode.setData("Buzz");
        } else {
            System.out.print(fizzyTreeNode.getData() + " ");
        }
        fizzBuzz(fizzyTreeNode.left);
        fizzBuzz(fizzyTreeNode.right);
    }

    public void fizzBuzz() { fizzBuzz(root); }

}
