# Trees
Binary Trees are Data structures made up of nodes. Those nodes have a left and a right pointer to another node. The tree can be filled with a variety of data but a binary tree will always have the ability to hold 

## Challenge
Create a Node Class, a Binary Tree Class, and a binary search tree class. 

## Approach & Efficiency

For my TreeNode class I created a protected left and right along with a contructor. The TreeNode class is generic. 

For the BinaryTree class there are two contructors and it is a generic class. 

For the BinarySearchTree it extends the Binary Tree class and is an integer implementation so there is no current need to make it explicitly comparable. 




## API

### Binary Tree

Methods available preOrder, postOrder, inOrder methods are public and call a private method that returns an arraylist of values in the tree. 

### Binary Search Tree

Inherets the public methods listed above as well as an add method that takes in an Integer and a contains method. The contains method returns a boolean and searches the tree for the value. 