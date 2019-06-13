# Challenge Summary
Given a string, and a method that returns a boolean, see if a string is balanced. 
## Challenge Description
Write a method that ensures that any string passed has a balanced set of brackets if brackets exist in the string. 

## Approach & Efficiency
My approach to this problem was instituting a open brack stack which would be loaded with open bracket characters. This stack is checked against current and previous character pointers that tracks. If the open stack is empty against a closed bracket that exists it will trigger false, also for the sake of the problem I consider all strings that don't have brackets as true in the boolean. 

## Solution
[Code](https://github.com/GoldBeardSea/data-structures-and-algorithms/tree/master/401Challenges/src/main/java/Challenges/)

![alt text](https://raw.githubusercontent.com/GoldBeardSea/data-structures-and-algorithms/master/assets/mbv.jpg "White Board")