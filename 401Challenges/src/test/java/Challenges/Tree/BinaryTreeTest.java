package Challenges.Tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BinaryTreeTest {
    BinaryTree bt;

    @Before
    public void initialized() {
        bt = new BinaryTree(1);
        bt.getRoot().left = new TreeNode(2);
        bt.getRoot().right = new TreeNode(3);
        bt.getRoot().left.left = new TreeNode(4);
        bt.getRoot().left.right = new TreeNode(5);
        bt.getRoot().right.left = new TreeNode(6);
        bt.getRoot().right.right = new TreeNode(7);
    }

    @Test
    public void instantiateTree_test() {
        BinaryTree nullTree = new BinaryTree();
        assertNull(nullTree.getRoot());
    }

    @Test
    public void instantiateTreeWithValue_test() {
        BinaryTree integerTree = new BinaryTree(15);
        assertEquals("this should be 15", 15, integerTree.getRoot().data);
    }

    @Test
    public void instantiateTreeWithValueAndAdd_test() {
        BinaryTree integerTree = new BinaryTree(15);
        integerTree.getRoot().left = new TreeNode(10);
        integerTree.getRoot().right = new TreeNode(20);
        assertEquals("this should be 10", 10, integerTree.getRoot().left.data);
        assertEquals("this should be 20", 20, integerTree.getRoot().right.data);

    }

    @Test
    public void test_preOrder() {
        ArrayList binary = bt.preOrder();
        assertEquals("First Value should be same as root", 1, binary.toArray()[0]);
        assertEquals("Last Value should be the last value", 7, binary.toArray()[6]);

    }

    @Test
    public void test_inOrder() {
        ArrayList binary = bt.inOrder();
        assertEquals("middle value of array should be equal to root", 1, binary.toArray()[3]);
    }

    @Test
    public void test_postOrder() {
        ArrayList binary = bt.postOrder();
        assertEquals("the final index should be the same value of the root", 1, binary.toArray()[6]);
    }

    @Test
    public void test_postOrder_empty() {
        BinaryTree emptyBT = new BinaryTree();
        assertTrue(emptyBT.postOrder().isEmpty());
    }

    @Test
    public void test_inOrder_empty() {
        BinaryTree emptyBT = new BinaryTree();
        assertTrue(emptyBT.inOrder().isEmpty());
    }

    @Test
    public void test_preOrder_empty() {
        BinaryTree emptyBT = new BinaryTree();
        assertTrue(emptyBT.preOrder().isEmpty());
    }
}