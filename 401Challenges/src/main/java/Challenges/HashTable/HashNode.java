package Challenges.HashTable;

public class HashNode {


    private String key;
    private String value;
    private HashNode next;

    public HashNode(String key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public HashNode getNext() {
        return next;
    }

    public void next(HashNode next) {
        this.next = next;
    }
}
