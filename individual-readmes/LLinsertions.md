# Challenge Summary
Given a singly linked list made up of nodes, append the linked list with a new val, insert a value before a node, insert a value after a given node. 

## Challenge Description
A linked list being a structure that is made up of nodes with values and a pointer to the next node, needs to maintain a reference for insertions before and after nodes within the structure. If you insert incorrectly you can lose reference to the rest of the list. 

## Approach & Efficiency
The approach to both is similar, initiate a while loop starting at the head of the node. To append for the end of the list when the current has a next of null you insert the new node as the next reference. For insert after, you look at the current.next for the data of the node, when it matches save a reference to the rest of the list while pointing the current node to the new node, and the new node to the remaining list.

## Solution
![alt text](https://raw.githubusercontent.com/GoldBeardSea/data-structures-and-algorithms/master/assets/llinsertions.jpg "White Board")
![alt text](https://raw.githubusercontent.com/GoldBeardSea/data-structures-and-algorithms/master/assets/llinsertions.jpg "White Board 2")

[Code] (https://github.com/GoldBeardSea/data-structures-and-algorithms/tree/master/401Challenges/src/main/java/Challenges/linkedlist)