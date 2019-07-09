package Challenges.HashTable;

public class HashTable {

    protected HashNode[] rows;

    public HashTable(int rows) {
        this.rows = new HashNode[rows];
    }

    public int hash(String key) {
        return hasher(key);
    }

    private int hasher(String key) {
        int hashValue = 0;
        char[] letters = key.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            hashValue += letters[i];
        }
        hashValue = hashValue * 599;
        return hashValue % rows.length;
    }

    public String add(String key, String value) {
        int hashedKey = hash(key);
        HashNode hashNodeRow = rows[hashedKey];

        if (hashNodeRow == null) {
            rows[hashedKey] = new HashNode(key, value);
            return "Added New";
        }

        if (hashNodeRow.getKey().equals(key)) {
            hashNodeRow.next(new HashNode(key, value));
            return "Added Next";
        }

        hashNodeRow.next(new HashNode(key, value));
        return "Added Next";
    }

    public String get(String key) {
        int targetHash = hash(key);
        HashNode hashNodeRow = rows[targetHash];

        if (hashNodeRow == null) {
            return null;
        }

        while (hashNodeRow.getNext() != null) {
            if (hashNodeRow.getNext().getKey().equals(key)) {
                return hashNodeRow.getNext().getValue();
            }
        }

        if (hashNodeRow.getKey().equals(key)) {
            return hashNodeRow.getValue();
        }

        return null;
    }

    public boolean contains(String key) {
        return (get(key) != null);
    }
}
