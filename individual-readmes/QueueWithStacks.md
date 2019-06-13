# Challenge Summary
Create a pseudoQueue class that can instantiate a queue using two stacks. 
## Challenge Description
Write a enqueue and dequeue method. 

## Approach & Efficiency
Big O Space O(1) Time: O(1) enqueue method. 
Big O Space O(1) Time: O(n) dequeue method.

I enqueue to the first stack for the first method. 

I dequeue putting all vals into the second stack, popping off to grab that value, then flipping everything back over to stack one and then enqueuing can occur again. 

To create the class I created two stacks using my stack class. I also make a getter method to test the first stack which is the stack I operate on. 

## Solution
[Code](https://github.com/GoldBeardSea/data-structures-and-algorithms/tree/master/401Challenges/src/main/java/Challenges/)

![alt text](https://raw.githubusercontent.com/GoldBeardSea/data-structures-and-algorithms/master/assets/queuewithstacks.jpg "White Board")