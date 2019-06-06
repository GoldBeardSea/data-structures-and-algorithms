
package Challenges.linkedlist;

public class LinkedList {

    public ListNode root;

    public LinkedList() {
        this.root = null;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public int size() {
        int total = 0;
        ListNode current = root;

        while (current != null) {
            total++;
            current = current.next;
        }

        return total;
    }

    public void insert(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = root;
        root = newNode;
    }

    public boolean contains(int val) {
        boolean seen = false;
        if (root == null) {
            System.out.println("Linked List is empty");
            return seen;
        }

        ListNode iterator = root;
        while (iterator != null) {
            if (iterator.data == val) {
                seen = true;
                return seen;
            }

            iterator = iterator.next;
        }

        return seen;
    }

    public String printList() {
         StringBuilder theBuilder = new StringBuilder();
        if (root == null) {
            theBuilder.append("<Null>");

            return theBuilder.toString();
        } else {
            ListNode temp = root;
            theBuilder.append("<");

            while (temp != null) {
                if (temp == root) {
                    String insert = "[" + temp.data + "]" + " --> ";
                    theBuilder.append(insert);
                } else {
                    String insert = "[" + temp.data + "] --> ";
                    theBuilder.append(insert);

                }

                temp = temp.next;
            }

            String theEnd = "[end]>";
            theBuilder.append(theEnd);
            return theBuilder.toString();
        }
    }
    //insertions
    public void appends(int newValue) {
        ListNode newNodeValue = new ListNode(newValue);
        ListNode current = root;
        if(current == null){
            current = newNodeValue;
            return;
        }

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNodeValue;
        return;
    }

    public void insertAfter(int inListVal, int insertVal) {
        ListNode newValue = new ListNode(insertVal);
        ListNode current = root;
        if(root == null){
            System.out.println("Empty list");
            return;
        }

        while (current.data != inListVal) {
            current = current.next;
        }
        if (current.data == inListVal) {
            newValue.next = current.next;
            current.next = newValue;
        }

    }

    public void insertBefore(int inListVal, int insertVal) {
        ListNode insertedNode = new ListNode(insertVal);
        ListNode current = root;

        if(root == null){
            System.out.println("Empty list");
            return;
        }

        if (root.data == inListVal){
            insert(insertVal);
        }

        while (current.next !=null && current.next.data != inListVal) {
            current = current.next;
        }
        insertedNode.next = current.next;
        current.next = insertedNode;
    }

    public int kthFromEnd(int kth) {
        int length = 0;
        ListNode current = root;
        if (root == null || kth < 0) {
            throw new NullPointerException("The linked list you want to call the method on is empty");
        }
        while (current != null) {
            current = current.next;
            length++;
        }
        if (length < kth) {
            throw new IllegalArgumentException("Kth must be larger than the list");
        }
        current = root;
        for (int i = 1; i < length - kth + 1; i++) {
            current = current.next;
        }

        return current.data;
    }

    //merge
    public static LinkedList mergeList (LinkedList one, LinkedList two) {
        if (one.isEmpty() && two.isEmpty()) {
            throw new NullPointerException("These lists are empty");
        }

        if (one.root == null && two.root != null) {
            System.out.println("Warning: The First Linked List Argument is Empty returning Second List");
            return two;
        }
        if (two.root == null && one.root != null) {
            System.out.println("Warning: The Second Linked List Argument is Empty returning First List");
            return one;
        }

        ListNode first = one.root;
        ListNode firstTemp = first.next;

        ListNode second = two.root;
        ListNode secondTemp = second.next;

        if (firstTemp == null) {
            first.next = second;
            return one;
        }

        while (firstTemp != null && secondTemp != null) {
            first.next = second;
            second.next = firstTemp;
            first = firstTemp;
            second = secondTemp;
            firstTemp = firstTemp.next;
            secondTemp = secondTemp.next;
        }

        if (second.next == null) {
            first.next = second;
            second.next = firstTemp;
        }
        return one;
    }

}