package Challenges.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {


    @Test
    public void size_test() {
        LinkedList newLinkedList = new LinkedList();
        ListNode testNode = new ListNode(8);
        ListNode testNodeTwo = new ListNode(9);
        newLinkedList.root = testNode;
        testNode.next = testNodeTwo;
        assertEquals(2, newLinkedList.size());
    }

    @Test
    public void insert_buildList() {
        LinkedList newLinkedList = new LinkedList();
        newLinkedList.insert(1);
        newLinkedList.insert(2);
        newLinkedList.insert(3);
        newLinkedList.insert(4);
        newLinkedList.printList();
        assertEquals(4, newLinkedList.size());

    }

    @Test
    public void isEmpty_test() {
        LinkedList newLinkedList = new LinkedList();
        assertTrue(newLinkedList.isEmpty());
    }

    @Test
    public void appends_testInsertAndAppend() {
        LinkedList newLinkedList = new LinkedList();
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
        LinkedList testLinkedList = new LinkedList();
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
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(10);
        testLinkedList.appends(100);
        testLinkedList.appends(10000);
        testLinkedList.appends(100000);
        testLinkedList.appends(1000000);
        testLinkedList.insertBefore(10000, 1000);
        testLinkedList.printList();
    }

    @Test
    public void contains_Contains() {
        LinkedList testLinkedList = new LinkedList();
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
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(10);
        testLinkedList.appends(100);
        testLinkedList.appends(10000);
        testLinkedList.appends(100000);
        testLinkedList.appends(1000000);
        testLinkedList.insertBefore(10000, 1000);
        testLinkedList.contains(1000);
        assertFalse(testLinkedList.contains(12));
    }

    @Test
    public void printList() {
        LinkedList testLinkedList = new LinkedList();
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
}