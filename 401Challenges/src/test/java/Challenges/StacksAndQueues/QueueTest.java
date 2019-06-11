package Challenges.StacksAndQueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class QueueTest {
    public Queue testQueue;
    public Queue testQueueTwo;


    @Before
    public void initialized() {
        testQueue = new Queue();
        testQueueTwo = new Queue();
    }

    @Test
    public void isEmpty(){
        assertTrue(testQueue.isEmpty());
    }

    @Test
    public void isEmpty_false(){
        testQueue.enqueue(5);
        assertFalse(testQueue.isEmpty());
    }

    @Test
    public void enqueue_test() {
        testQueue.enqueue(5);
        testQueueTwo.enqueue(15);
        testQueueTwo.enqueue(25);
        testQueueTwo.enqueue(5);
        testQueueTwo.enqueue(-10);
        assertEquals((Integer) 5, testQueue.peek());
        assertEquals((Integer) 15, testQueueTwo.peek());
        assertEquals((Integer) (-10), testQueueTwo.peekRear());
    }

    @Test
    public void dequeue_test() {
        testQueue.enqueue(5);
        testQueueTwo.enqueue(15);
        testQueueTwo.enqueue(25);
        testQueueTwo.enqueue(5);
        testQueueTwo.enqueue(-10);
        assertEquals(5, testQueue.dequeue());
        assertEquals(15, testQueueTwo.dequeue());
        testQueueTwo.dequeue();
        testQueueTwo.dequeue();
        assertEquals(-10, testQueueTwo.dequeue());
        assertTrue(testQueue.isEmpty());
        testQueueTwo.enqueue(5);
        assertFalse(testQueueTwo.isEmpty());
        assertEquals(5, testQueueTwo.dequeue());

    }

    @Test(expected = NullPointerException.class)
    public void pop_test_OnEmptyStack() {
        testQueue.dequeue();
    }


    @Test
    public void peek_test() {
        testQueueTwo.enqueue(10000);
        testQueue.enqueue(10);
        testQueue.enqueue(15);
        assertEquals((Integer) 10000, testQueueTwo.peek());
        assertEquals((Integer) 10, testQueue.peek());
    }
}