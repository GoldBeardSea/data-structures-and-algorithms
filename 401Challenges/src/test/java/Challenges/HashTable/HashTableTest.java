package Challenges.HashTable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {

    @Test
    public void hash() {
        String key = "Hello";
        HashTable newTable = new HashTable(500);
        int result = newTable.hash(key);
        assertEquals("hello should be 0", 0, result);
    }

    @Test
    public void add() {
        HashTable newTable = new HashTable(31);
        String resultOne = newTable.add("Banana", "Boat");
        String resultTwo = newTable.add("Banana", "Boats");
        String resultThree = newTable.add("Bananas", "Boats");
        String resultFour = newTable.add("Bananas", "Banana");
        assertEquals("should add new", "Added New", resultOne);
        assertEquals("should add new", "Added New", resultThree);
        assertEquals("should be added next", "Added Next", resultTwo);
        assertEquals("should be added next", "Added Next", resultFour);
    }

    @Test
    public void get() {
        HashTable newTable = new HashTable(31);
        String resultOne = newTable.add("Banana", "Boat");
        String resultTwo = newTable.add("Banana", "Boats");
        String resultThree = newTable.add("Bananas", "Banana");
        assertEquals("due to this collision should be boats", "Boats", newTable.get("Banana"));
        assertEquals("due to no collision", "Banana", newTable.get("Bananas"));
        assertNull(newTable.get("I don't think so"));
    }

    @Test
    public void contains() {
        HashTable newTable = new HashTable(31);
        String resultOne = newTable.add("Banana", "Boat");
        String resultTwo = newTable.add("Banana", "Boats");
        String resultThree = newTable.add("Bananas", "Banana");
        assertTrue(newTable.contains("Banana"));
        assertFalse(newTable.contains("I don't think so"));
    }
}