package Challenges.StacksAndQueues;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class PseudoqueueTest {
    public Pseudoqueue testQueue;
    public Pseudoqueue testQueueTwo;

    @Before
    public void initialized() {
        testQueue = new Pseudoqueue();
        testQueueTwo = new Pseudoqueue();
        testQueueTwo.enqueue(5);
        testQueueTwo.enqueue(10);
    }

    @Test
    public void test_enqueue() {
        testQueue.enqueue(1);
        testQueue.enqueue(2);
        assertFalse(testQueue.getStackOne().isEmpty());
        assertEquals("since we are pseudoqueueing the first stack", 2, testQueue.getStackOne().peek());
        testQueueTwo.enqueue(55);
        assertEquals("This value should be 55", 55, testQueueTwo.getStackOne().peek());
    }

    @Test(expected = EmptyStackException.class)
    public void test_dequeue_empty() {
        testQueue.dequeue();
    }

    @Test
    public void test_dequeue_happy() {
        testQueue.enqueue(1);
        testQueue.enqueue(5);
        testQueue.enqueue(10);
        testQueue.enqueue(15);
        assertEquals("This value should be one FIFO", 1, testQueue.dequeue());
        assertEquals("this value should be 5 FIFO", 5, testQueueTwo.dequeue() );
    }

    @Test
    public void test_enqueueDequeueEnqueueDequeue() {
        testQueue.enqueue(10);
        testQueue.dequeue();
        testQueue.enqueue(55);
        assertEquals("this should be 55", 55, testQueue.dequeue());
        testQueueTwo.enqueue(5);
        testQueueTwo.dequeue();
        // should dequeue 5
        testQueueTwo.enqueue(15);
        assertEquals("This should be 10, fifo", 10, testQueueTwo.dequeue());
    }
}