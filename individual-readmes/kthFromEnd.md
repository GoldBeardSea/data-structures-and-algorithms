# Challenge Summary
Given a singly linked list made up of nodes, return the data in the node located kth from end. Handle any exceptions you might come across. 

## Challenge Description
A linked list being a structure that is made up of nodes with values and a pointer to the next node, with an unknown length linked list in order to get the kth from the end you need to at least have a reference to how long the list is in order to grab those values. There are a few ways to approach this, I chose a while and a for loop, but it can be done in a single loop if you advance a fast pointer node. Instead of just having a current. 

## Approach & Efficiency
Handle for illegal exception of null pointers before the start of the list, then initiate a while loop that counts nodes, then initiate a for loop that ends on the kth from end node. 

## Solution
[Code](https://github.com/GoldBeardSea/data-structures-and-algorithms/tree/master/401Challenges/src/main/java/Challenges/linkedlist)

![alt text](https://raw.githubusercontent.com/GoldBeardSea/data-structures-and-algorithms/master/assets/kthfromend.jpg "White Board")
