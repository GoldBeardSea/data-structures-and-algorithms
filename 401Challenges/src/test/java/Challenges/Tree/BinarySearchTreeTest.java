package Challenges.Tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {
    BinarySearchTree bst;
    @Before
    public void initialized() {
        bst = new BinarySearchTree();
    }

    @Test
    public void emptyBST_test() {
        assertNull(bst.root);
    }

    @Test
    public void add_test() {
        bst.add(50);
        bst.add(10);
        bst.add(100);
        bst.add(25);
        bst.add(75);
        bst.add(55);
        assertEquals("this should be 50", (Integer) 50, bst.getRoot().data);
        assertEquals("this should be 10", (Integer) 10, bst.getRoot().left.data);
        assertEquals("this should be 55", (Integer) 55, bst.getRoot().right.left.left.data);

    }

    @Test
    public void containsHappy_test() {
        bst.add(50);
        bst.add(10);
        bst.add(100);
        bst.add(25);
        bst.add(75);
        bst.add(55);
        assertTrue(bst.contains(55));
        assertTrue(bst.contains(25));
    }

    @Test
    public void containsFail_test() {
        bst.add(50);
        bst.add(10);
        bst.add(100);
        bst.add(25);
        bst.add(75);
        bst.add(55);
        assertFalse(bst.contains(54));
        assertFalse((bst.contains(-10)));
    }

    @Test
    public void containsEmpty_test() {
        assertFalse(bst.contains(5));
    }
}