package Challenges.StacksAndQueues;

import java.util.EmptyStackException;

public class Pseudoqueue {


    private Stack stackOne;
    private Stack stackTwo;

    public Pseudoqueue() {
        stackOne = new Stack();
        stackTwo = new Stack();
    }

    public void enqueue(int insertion) {
        stackOne.push(insertion);
    }

    public int dequeue() {
        if (stackOne.isEmpty()) {
            throw new EmptyStackException();
        }
        while (!stackOne.isEmpty()) {
            stackTwo.push(stackOne.pop());
        }
        int result = stackTwo.pop();
        while(!stackTwo.isEmpty()) {
            stackOne.push(stackTwo.pop());
        }
        return result;
    }

    public Stack getStackOne() {
        return stackOne;
    }

}