package Challenges.linkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    LinkedList newLinkedList;
    LinkedList testLinkedList;
    @Before
    public void initialized() {
        newLinkedList = new LinkedList();
        testLinkedList = new LinkedList();
    }

    @Test
    public void size_test() {
        ListNode testNode = new ListNode(8);
        ListNode testNodeTwo = new ListNode(9);
        newLinkedList.root = testNode;
        testNode.next = testNodeTwo;
        assertEquals(2, newLinkedList.size());
    }

    @Test
    public void size_testEmpty() {
        assertEquals(0, newLinkedList.size());
    }

    @Test
    public void insert_buildList() {
        newLinkedList.insert(1);
        newLinkedList.insert(2);
        newLinkedList.insert(3);
        newLinkedList.insert(4);
        newLinkedList.printList();
        assertEquals(4, newLinkedList.size());

    }

    @Test
    public void isEmpty_test() {
        assertTrue(newLinkedList.isEmpty());
    }

    @Test
    public void isEmpty_testNotEmpty() {
        newLinkedList.insert(1);
        assertFalse(newLinkedList.isEmpty());
    }

    @Test
    public void appends_testInsertAndAppend() {
        newLinkedList.insert(10);
        newLinkedList.appends(-10);
        newLinkedList.appends(-15);
        newLinkedList.appends(-20);
        newLinkedList.appends(-30);
        newLinkedList.printList();
        assertEquals(-15, newLinkedList.root.next.next.data);
    }

    @Test
    public void insertAfter_test() {
        testLinkedList.insert(10);
        testLinkedList.appends(100);
        testLinkedList.appends(10000);
        testLinkedList.appends(100000);
        testLinkedList.appends(1000000);
        testLinkedList.insertAfter(100, 1000);
        testLinkedList.printList();
        assertEquals(1000, testLinkedList.root.next.next.data);
    }

    @Test
    public void insertBefore_test() {
        testLinkedList.insert(10);
        testLinkedList.appends(100);
        testLinkedList.appends(10000);
        testLinkedList.appends(100000);
        testLinkedList.appends(1000000);
        testLinkedList.insertBefore(10000, 1000);
        testLinkedList.printList();
        System.out.println(testLinkedList.printList());
    }

    @Test
    public void contains_Contains() {
        testLinkedList.insert(10);
        testLinkedList.appends(100);
        testLinkedList.appends(10000);
        testLinkedList.appends(100000);
        testLinkedList.appends(1000000);
        testLinkedList.insertBefore(10000, 1000);
        testLinkedList.contains(1000);
        assertTrue(testLinkedList.contains(1000));
    }

    @Test
    public void contains_DoesNotContain() {
        testLinkedList.insert(10);
        testLinkedList.appends(100);
        testLinkedList.appends(10000);
        testLinkedList.appends(100000);
        testLinkedList.appends(1000000);
        testLinkedList.insertBefore(10000, 1000);
        testLinkedList.contains(1000);
        assertFalse(testLinkedList.contains(12));
        System.out.println(testLinkedList.printList());
    }

    @Test
    public void printList_test() {
        testLinkedList.insert(10);
        testLinkedList.appends(100);
        testLinkedList.appends(10000);
        testLinkedList.appends(100000);
        testLinkedList.appends(1000000);
        testLinkedList.insertBefore(10000, 1000);
        testLinkedList.insertAfter(1000000, 10000000);
        testLinkedList.insertBefore(10, 1);
        String actual = testLinkedList.printList();
        String test = "<[1] --> [10] --> [100] --> [1000] --> [10000] --> [100000] --> [1000000] --> [10000000] --> [1] --> [end]>";
        assertEquals(test, actual);

    }
    @Test
    public void printList_testEmpty() {
        String actual = testLinkedList.printList();
        String test = "<Null>";
        assertTrue(testLinkedList.isEmpty());
        assertEquals(test, actual);
        System.out.println(actual);
    }


    // kth tests
    @Test(expected = NullPointerException.class)
    public void kthFromEnd_test_emptyList() {
        testLinkedList.kthFromEnd(5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void kthFromEnd_test_kthLonger() {
        testLinkedList.insert(5);
        testLinkedList.kthFromEnd(5);
    }

    @Test
    public void kthFromEnd_test_exactLength() {
        testLinkedList.insert(10);
        testLinkedList.appends(100);
        testLinkedList.appends(1000);
        testLinkedList.appends(10000);
        testLinkedList.appends(100000);
        assertEquals(10, testLinkedList.kthFromEnd(5));
    }

    @Test(expected = NullPointerException.class)
    public void kthFromEnd_test_negative() {
        testLinkedList.insert(10);
        testLinkedList.appends(100);
        testLinkedList.appends(1000);
        testLinkedList.appends(10000);
        testLinkedList.appends(100000);
        testLinkedList.kthFromEnd(-5);
    }

    @Test
    public void kthFromEnd_test_oneOne() {
        testLinkedList.insert(5);
        testLinkedList.kthFromEnd(1);
        assertEquals(5, testLinkedList.kthFromEnd(1));
    }
    @Test
    public void kthFromEnd_test_happy() {
        testLinkedList.insert(10);
        testLinkedList.appends(100);
        testLinkedList.appends(1000);
        testLinkedList.appends(10000);
        testLinkedList.appends(100000);
        testLinkedList.kthFromEnd(3);
        assertEquals(1000, testLinkedList.kthFromEnd(3));
    }

    @Test
    public void mergeList_test_evenSteven() {
        testLinkedList.insert(10);
        testLinkedList.appends(100);
        testLinkedList.appends(1000);
        testLinkedList.appends(10000);

        newLinkedList.insert(20);
        newLinkedList.appends(200);
        newLinkedList.appends(2000);
        newLinkedList.appends(20000);

        LinkedList merged = LinkedList.mergeList(testLinkedList, newLinkedList);
        assertEquals(8, merged.size());
        assertEquals(20, merged.root.next.data);
        System.out.println(merged.printList());


    }

    @Test
    public void mergeList_test_OneBigger() {
        testLinkedList.insert(10);
        testLinkedList.appends(100);
        testLinkedList.appends(1000);
        testLinkedList.appends(10000);

        newLinkedList.insert(20);
        newLinkedList.appends(200);
        LinkedList merged = LinkedList.mergeList(testLinkedList, newLinkedList);
        System.out.println(merged.printList());
        assertEquals(6, merged.size());
    }

    @Test
    public void mergeList_test_TwoBigger() {
        testLinkedList.insert(10);
        testLinkedList.appends(100);
        testLinkedList.appends(1000);
        testLinkedList.appends(10000);


        newLinkedList.insert(20);
        newLinkedList.appends(200);
        LinkedList merged = LinkedList.mergeList(testLinkedList, newLinkedList);
        System.out.println(merged.printList());
        assertEquals(6, merged.size());
    }

    @Test(expected = NullPointerException.class)
    public void mergeList_test_Empty() {
        LinkedList merged = LinkedList.mergeList(testLinkedList, newLinkedList);
    }

    @Test
    public void mergeList_test_TwoEmpty() {
        testLinkedList.insert(10);
        LinkedList merged = LinkedList.mergeList(testLinkedList, newLinkedList);
        assertEquals(1, merged.size());
    }

    @Test
    public void mergeList_test_OneEmpty() {
        newLinkedList.insert(10);
        LinkedList merged = LinkedList.mergeList(testLinkedList, newLinkedList);
        assertEquals(1, merged.size());
    }

    @Test
    public void mergeList_test_EdgeCaseSmallOne() {
        newLinkedList.insert(2);
        newLinkedList.appends(3);

        testLinkedList.insert(1);
        LinkedList merged = LinkedList.mergeList(testLinkedList, newLinkedList);
        System.out.println(merged.printList());
        assertEquals(3, merged.size());

    }

    @Test
    public void mergeList_test_EdgeCaseSmallTwo() {
        newLinkedList.insert(2);

        testLinkedList.insert(1);
        testLinkedList.appends(3);
        LinkedList merged = LinkedList.mergeList(testLinkedList, newLinkedList);
        assertEquals(3, merged.size());
        System.out.println(merged.printList());
    }

    @Test
    public void sizeRecurisve_test() {
        newLinkedList.insert(5);
        newLinkedList.appends(10);
        newLinkedList.appends(15);
        newLinkedList.appends(20);
        newLinkedList.sizeRecursive();
        assertEquals(4, newLinkedList.sizeRecursive());
    }

}