package Challenges.StacksAndQueues;

import java.util.EmptyStackException;

public class Pseudoqueue <T> {


    private Stack<T> stackOne;
    private Stack<T> stackTwo;

    public Pseudoqueue() {
        stackOne = new Stack();
        stackTwo = new Stack();
    }

    public void enqueue(T insertion) {
        stackOne.push(insertion);
    }

    public T dequeue() {
        if (stackOne.isEmpty()) {
            throw new EmptyStackException();
        }
        while (!stackOne.isEmpty()) {
            stackTwo.push(stackOne.pop());
        }
        T result = stackTwo.pop();
        while(!stackTwo.isEmpty()) {
            stackOne.push(stackTwo.pop());
        }
        return result;
    }

    public Stack getStackOne() {
        return stackOne;
    }

}