# Stacks and Queues
Stacks and Queues are two types of Data Structues that take in nodes of information and constructs them by linking the nodes together in a relationship.

## Challenge
Implement our Own Stack and Queue classes made of Nodes. 

## Approach & Efficiency
I constructed both the Stack and Queue class using a non generic Node class that has next and data as fields. 

I emphasized staying as close to O(1); as possible with the methods attached to each class. 

When a Queue or Stack is empty I will throw a null pointer exception. 
## API

### Node
getData() is a public method that returns the data for a node

setData() is a setter for setting the node but isn't used yet in code. 

### Stack

public boolean isEmpty() returns a boolean to test to see if the stack is empty. 

public void push(int insertVal) takes in an integer and creates a node, it insets the node into the stack. 

public int pop() returns the integer of the value popped off the list and removes the node from the stack. 

public int peek() returns the data from the top node. 

### Queues 

Queues have properties of front and rear. 

void enqueue (int dataInsert) creates a new node and inserts it onto the list. 

int dequeue () pops a node off the front of the list and returns the node value as an integer. 

int peek () gets the data of the front node. 

int peekRear() get the data from the rear node. 