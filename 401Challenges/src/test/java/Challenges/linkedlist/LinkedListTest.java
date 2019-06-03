package Challenges.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

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
    public void insertBefore_test() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(10);
        testLinkedList.appends(100);
        testLinkedList.appends(10000);
        testLinkedList.appends(100000);
        testLinkedList.appends(1000000);
        testLinkedList.insertBefore(10000, 1000);
        testLinkedList.printList();
        assertEquals();
    }

    @Test
    public void append1() {
    }

    @Test
    public void insertBefore1() {
    }

    @Test
    public void insertAfter1() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void contains() {
    }

    @Test
    public void printList() {
    }
}