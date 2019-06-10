package Challenges.StacksAndQueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    public Stack testStack;
    public Stack testStackTwo;

    @Before
    public void intialized() {
        testStack = new Stack();
        testStackTwo = new Stack();
    }

    @Test
    public void isEmpty(){
        assertTrue(testStack.isEmpty());
        testStackTwo.push(5);
        assertFalse(testStackTwo.isEmpty());
        testStackTwo.pop();
        assertTrue(testStackTwo.isEmpty());
    }

    @Test
    public void push_test() {
        testStack.push(5);
        testStackTwo.push(15);
        testStackTwo.push(25);
        testStackTwo.push(5);
        testStackTwo.push(-10);
        assertEquals(5, testStack.peek());
        assertEquals(-10, testStackTwo.peek());
        assertEquals(25, testStackTwo.top.next.next.getData());
    }

    @Test
    public void pop_test() {
        testStack.push(5);
        testStackTwo.push(15);
        testStackTwo.push(25);
        testStackTwo.push(5);
        testStackTwo.push(-10);
        assertEquals(5, testStack.pop());
        assertEquals(-10, testStackTwo.pop());
        testStackTwo.pop();
        testStackTwo.pop();
        // should pop 15;
        assertEquals(15, testStackTwo.pop());
        assertTrue(testStack.isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void pop_test_OnEmptyStack() {
        testStack.pop();
    }


    @Test
    public void peek_test() {
        testStackTwo.push(10000);
        testStack.push(10);
        testStack.push(15);
        assertEquals(10000, testStackTwo.peek());
        assertEquals(15, testStack.peek());
    }
}