
package Challenges.linkedlist;

public class LinkedList {

    public ListNode root;
    public ListNode current;
    public ListNode temp;

    public LinkedList() {
        this.root = null;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public int size() {
        int total = 0;

        current = this.root;

        while (current != null) {
            total++;
            current = current.next;
        }

        return total;
    }

    public ListNode appends(int newValue) {
        ListNode newNodeValue = new ListNode(newValue);
        current = this.root;
        if(current == null){
            current = newNodeValue;
            return current;
        }

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNodeValue;
        return newNodeValue;
    }

    public void insertAfter(int inListVal, int insertVal) {
        try {
            ListNode newValue = new ListNode(insertVal);
            current = this.root;

            while (current.data != inListVal) {
                current = current.next;
            }

            newValue.next = current.next;
            current.next = newValue;

        } catch (NullPointerException e) {
            System.out.println("End of the List.");
        }
    }

    public void insertBefore(int inListVal, int insertVal) {
        ListNode insertedNode = new ListNode(insertVal);
        current = this.root;

        if(this.root == null){
            System.out.println("Empty list");
            return;
        }

        if (this.root.data == inListVal){
            this.insert(insertVal);
        }

        while (current.next !=null && current.next.data != inListVal) {
            current = current.next;
        }

        insertedNode.next = current.next;
        current.next = insertedNode;
    }

    public void insert(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = this.root;
        this.root = newNode;
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
            theBuilder.append("< Null >");

            return theBuilder.toString();
        } else {
            ListNode temp = root;
            theBuilder.append("<");

            while (temp != null) {
                if (temp == this.root) {
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

}