package Challenges.Tree;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class IntersectionTest {
    Set<Integer> expected = new HashSet<>();
    Set<Integer> actual;

    @Test
    public void treeIntersection() {
        BinaryTree treeTest = new BinaryTree();
        TreeNode n1 = new TreeNode(150);
        TreeNode n2 = new TreeNode(100);
        TreeNode n3 = new TreeNode(250);
        TreeNode n4 = new TreeNode(75);
        TreeNode n5 = new TreeNode(160);
        TreeNode n6 = new TreeNode(200);
        TreeNode n7 = new TreeNode(350);
        TreeNode n8 = new TreeNode(125);
        TreeNode n9 = new TreeNode(175);
        TreeNode n10 = new TreeNode(300);
        TreeNode n11 = new TreeNode(500);


        treeTest.root = n1;
        n1.left = n2;
        n2.left = n4;
        n2.right = n5;
        n5.left = n8;
        n5.right = n9;

        n1.right = n3;
        n3.left = n6;
        n3.right = n7;
        n7.left = n10;
        n7.right = n11;

        BinaryTree treeTestTwo = new BinaryTree();
        TreeNode t1 = new TreeNode(42);
        TreeNode t2 = new TreeNode(100);
        TreeNode t3 = new TreeNode(600);
        TreeNode t4 = new TreeNode(15);
        TreeNode t5 = new TreeNode(160);
        TreeNode t6 = new TreeNode(200);
        TreeNode t7 = new TreeNode(350);
        TreeNode t8 = new TreeNode(125);
        TreeNode t9 = new TreeNode(175);
        TreeNode t10 = new TreeNode(4);
        TreeNode t11 = new TreeNode(500);


        treeTestTwo.root = t1;
        t1.left = t2;
        t2.left = t4;
        t2.right = t5;
        t5.left = t8;
        t5.right = t9;

        t1.right = t3;
        t3.left = t6;
        t3.right = t7;
        t7.left = t10;
        t7.right = t11;

        Set<Integer> actual = Intersection.treeIntersection(treeTest, treeTestTwo);
        Set<Integer> expected = new HashSet<>();
        expected.add(160);
        expected.add(100);
        expected.add(500);
        expected.add(200);
        expected.add(125);
        expected.add(350);
        expected.add(175);
        assertEquals(expected, actual);

    }

    @Test
    public void treeIntersectionEmpty() {

        BinaryTree treeTest = new BinaryTree();
        TreeNode n1 = new TreeNode(150);
        TreeNode n2 = new TreeNode(100);
        TreeNode n3 = new TreeNode(250);
        TreeNode n4 = new TreeNode(75);
        TreeNode n5 = new TreeNode(160);
        TreeNode n6 = new TreeNode(200);
        TreeNode n7 = new TreeNode(350);
        TreeNode n8 = new TreeNode(125);
        TreeNode n9 = new TreeNode(175);
        TreeNode n10 = new TreeNode(300);
        TreeNode n11 = new TreeNode(500);


        treeTest.root = n1;
        n1.left = n2;
        n2.left = n4;
        n2.right = n5;
        n5.left = n8;
        n5.right = n9;

        n1.right = n3;
        n3.left = n6;
        n3.right = n7;
        n7.left = n10;
        n7.right = n11;

        BinaryTree treeTestTwo = new BinaryTree();
        treeTestTwo.root = null;
        actual = Intersection.treeIntersection(treeTest, treeTestTwo);
        assertNull(actual);


    }

    @Test
    public void treeIntersectionSameTree() {
        BinaryTree treeTest = new BinaryTree();
        TreeNode n1 = new TreeNode(150);
        TreeNode n2 = new TreeNode(100);
        TreeNode n3 = new TreeNode(250);
        TreeNode n4 = new TreeNode(75);
        TreeNode n5 = new TreeNode(160);
        TreeNode n6 = new TreeNode(200);
        TreeNode n7 = new TreeNode(350);
        TreeNode n8 = new TreeNode(125);
        TreeNode n9 = new TreeNode(175);
        TreeNode n10 = new TreeNode(300);
        TreeNode n11 = new TreeNode(500);


        treeTest.root = n1;
        n1.left = n2;
        n2.left = n4;
        n2.right = n5;
        n5.left = n8;
        n5.right = n9;

        n1.right = n3;
        n3.left = n6;
        n3.right = n7;
        n7.left = n10;
        n7.right = n11;

        BinaryTree treeTestTwo = new BinaryTree();
        TreeNode t1 = new TreeNode(150);
        TreeNode t2 = new TreeNode(100);
        TreeNode t3 = new TreeNode(250);
        TreeNode t4 = new TreeNode(75);
        TreeNode t5 = new TreeNode(160);
        TreeNode t6 = new TreeNode(200);
        TreeNode t7 = new TreeNode(350);
        TreeNode t8 = new TreeNode(125);
        TreeNode t9 = new TreeNode(175);
        TreeNode t10 = new TreeNode(300);
        TreeNode t11 = new TreeNode(500);


        treeTestTwo.root = t1;
        t1.left = t2;
        t2.left = t4;
        t2.right = t5;
        t5.left = t8;
        t5.right = t9;

        t1.right = t3;
        t3.left = t6;
        t3.right = t7;
        t7.left = t10;
        t7.right = t11;
        actual = Intersection.treeIntersection(treeTest, treeTestTwo);

        expected.add(160);
        expected.add(100);
        expected.add(500);
        expected.add(150);
        expected.add(200);
        expected.add(250);
        expected.add(75);
        expected.add(300);
        expected.add(125);
        expected.add(350);
        expected.add(175);

        assertEquals(expected, actual);

    }

    @Test
    public void treeIntersectionDifferentStructuredTree() {
        BinaryTree treeTest = new BinaryTree();
        TreeNode n1 = new TreeNode(150);
        TreeNode n2 = new TreeNode(100);
        TreeNode n3 = new TreeNode(250);
        TreeNode n4 = new TreeNode(75);
        TreeNode n5 = new TreeNode(160);
        TreeNode n6 = new TreeNode(200);
        TreeNode n7 = new TreeNode(350);
        TreeNode n8 = new TreeNode(125);
        TreeNode n9 = new TreeNode(175);
        TreeNode n10 = new TreeNode(300);
        TreeNode n11 = new TreeNode(500);


        treeTest.root = n1;
        n1.left = n2;
        n2.left = n4;
        n2.right = n5;
        n5.left = n8;
        n5.right = n9;

        n1.right = n3;
        n3.left = n6;
        n3.right = n7;
        n7.left = n10;
        n7.right = n11;

        BinaryTree treeTestTwo = new BinaryTree();
        TreeNode t1 = new TreeNode(100);
        treeTestTwo.root = t1;
        actual = Intersection.treeIntersection(treeTest, treeTestTwo);
        expected.add(100);

        assertEquals(expected, actual);


    }
}