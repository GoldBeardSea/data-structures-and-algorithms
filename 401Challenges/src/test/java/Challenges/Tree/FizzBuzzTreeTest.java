package Challenges.Tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {


    @Test
    public void fizzBuzz() {
        FizzBuzzTree fbt = new FizzBuzzTree( 15);
        int startingRoot = (int) fbt.root.data;
        fbt.root.left = new TreeNode<>(1);
        fbt.root.left.left = new TreeNode<>(3);
        fbt.root.right = new TreeNode<>(5);
        fbt.root.right.right = new TreeNode<>(7);
        fbt.root.left.right = new TreeNode<>(12);
        fbt.root.right.left = new TreeNode<>(30);
        fbt.fizzBuzz();
        assertEquals("the root should be FizzBuzz", "FizzBuzz", fbt.root.data);
        assertNotEquals("The root should have changed from 15 to FizzBuzz", startingRoot, fbt.root.data);
    }

    @Test
    public void fizzBuzz_test_empty() {
        FizzBuzzTree fbt = new FizzBuzzTree();
        fbt.fizzBuzz();
        // test should not fail empty trees handled
        assertNull(fbt.getRoot());
    }

    @Test
    public void fizzBuzz_test_negative() {
        FizzBuzzTree fbt = new FizzBuzzTree(-5);
        int startingRoot = (int) fbt.root.data;
        fbt.root.left = new TreeNode<>(-3);
        int fizzNodeBefore = (int) fbt.root.left.data;
        fbt.root.left.left = new TreeNode<>(7);
        fbt.root.right = new TreeNode<>(11);
        fbt.root.right.right = new TreeNode<>(9);
        fbt.root.left.right = new TreeNode<>(33);
        fbt.root.right.left = new TreeNode<>(21);
        fbt.fizzBuzz();
        assertEquals("the root should be Buzz", "Buzz", fbt.root.data);
        assertNotEquals("The root should have changed from -5 to Buzz", startingRoot, fbt.root.data);
        assertNotEquals("The node should have been changed from -3 to Fizz", fizzNodeBefore, fbt.root.left.data);
    }

}