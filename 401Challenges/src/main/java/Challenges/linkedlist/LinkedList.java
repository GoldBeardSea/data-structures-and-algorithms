
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

        ListNode current = this.root;
        while (current != null) {
            total++;
            current = current.next;
        }
        return total;
    }

    public ListNode appends(int newValue) {
        ListNode newNodeValue = new ListNode(newValue);
        ListNode current = this.root;
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

    public void insertBefore(int value, int newVal) {
        try {
            ListNode newValue = new ListNode(newVal);
            ListNode current = this.root;

            while (current.data != value) {
                current = current.next;
            }
            newValue.next = current.next;
            current.next = newValue;
        } catch (NullPointerException e) {
            System.out.println("You have reached the end of the list.");
        }
    }

    public void insertAfter(ListNode targetNode, int insertVal) {
        if (targetNode == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        ListNode insertedNode = new ListNode(insertVal);
        insertedNode.next = targetNode.next;
        targetNode.next = insertedNode;
    }

    public void insert(int data) {
        ListNode nn = new ListNode(data);
        nn.next = this.root;
        this.root = nn;
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
        }

        return seen;
    }

    public void printList() {
        if (root == null) {
            System.out.print("<");
            System.out.print(">");
        } else {
            ListNode temp = root;
            System.out.print("<");
            while (temp != null) {
                if (temp == this.root) {
                    System.out.print("[" + temp.data + "]" + "-->");
                } else {
                    System.out.print("[" + temp.data + "]");
                    System.out.print("-->");
                }
                temp = temp.next;
            }
            System.out.println("[end]>");
        }
    }

}