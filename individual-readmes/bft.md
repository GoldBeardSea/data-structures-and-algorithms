# Challenge Summary
Given a Binary Tree conduct a breadth first traversal of the tree. 
## Challenge Description
Write a method for a breadth first binary tree. 
## Approach & Efficiency
My approach for this method is to create a method on the binary tree class, which can be called on a BT. In order to traverse the tree and return a testable collection I instatiate a queue that is a linked list and an array list. 
I add the node to the queue, then check if the left and right nodes are not null, adding them to the list and iterating across the list while the queue is not empty. Popping the queue feeds my array list with the node and I print the data. 

## Solution
[Code](https://github.com/GoldBeardSea/data-structures-and-algorithms/tree/master/401Challenges/src/main/java/Challenges/)

![alt text](https://raw.githubusercontent.com/GoldBeardSea/data-structures-and-algorithms/master/assets/bft.jpg "White Board")