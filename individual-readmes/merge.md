# Challenge Summary
Given a two singly linked lists, merge them together, first to second and return a single list. 

## Challenge Description
Given two singly linked lists merge them in an organized manner. The code should handle exceptions and give a warning if the inputs are less than desired. As well as handle uneven edgecases. 

## Approach & Efficiency
Big O Space O(1) Time: O(n)

The approach I took was to merge the linked lists in place on the first list and return the first list. 

In order to do so I declare four pointers, to look at the lists respective currents or next. 

Looking forward we determine if any of the nexts are null and in certain conditions return the remaining list that is longer than the one that no longer can be consumed in the merge. 

The greatest threats to this code is if a linked list is empty, or if the linked list only has one node. Those are handled in the code by conditionals as well. If one list is empty but the other is full the system will warn the user of which list was null and return the full list. 

## Solution
[Code](https://github.com/GoldBeardSea/data-structures-and-algorithms/tree/master/401Challenges/src/main/java/Challenges/linkedlist)

![alt text](https://raw.githubusercontent.com/GoldBeardSea/data-structures-and-algorithms/master/assets/merge.jpg "White Board")