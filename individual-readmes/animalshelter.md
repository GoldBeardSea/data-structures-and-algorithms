# Challenge Summary
Create an animal shelter that takes in dogs and cats, with an enqueue and dequeue method
## Challenge Description
Write a enqueue and dequeue method. The dequeue method should take in a parameter for a preference if no preference is found for cat or dog return null. As a stretch if I have time, I will refactor the null conditional to return the longest resident in shelter. 

## Approach & Efficiency
Big O Space O(1) Time: O(1) enqueue method. 
Big O Space O(1) Time: O(1) dequeue method.

I enqueue to the queue based on a conditional check of the class of the inserting object.

I dequeue by comparing the string of the preference to the classes of the queues, if the string doesn't match the queues it will return null. 

To create the class I created two stacks using my stack class. I also make a getter method to test the first stack which is the stack I operate on. 

## Solution
[Code](https://github.com/GoldBeardSea/data-structures-and-algorithms/tree/master/401Challenges/src/main/java/Challenges/StacksAndQueues)

![alt text](https://raw.githubusercontent.com/GoldBeardSea/data-structures-and-algorithms/master/assets/animalshelter.jpg "White Board")