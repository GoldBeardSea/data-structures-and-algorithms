# Challenge Summary
Given a binary tree create a method that find the largest value in the binary tree. 

## Challenge Description
Write a method that takes an input of a binary tree and finds the max value. 

## Approach & Efficiency
My approach for this is checking if the tree is empty or is made of non integers and returning 0 if it fails those checks and has a system print out notifying the user. 

I then reference the root node as a result, along with recursive assignments of the left and right node, returning the Max Value using Math.max() of the left right and result, this is passed to a public method call that references the root and calls the private function that does the body of the logic. 

## Solution
[Code](https://github.com/GoldBeardSea/data-structures-and-algorithms/tree/master/401Challenges/src/main/java/Challenges/)

![alt text](https://raw.githubusercontent.com/GoldBeardSea/data-structures-and-algorithms/master/assets/maxval.jpg "White Board")