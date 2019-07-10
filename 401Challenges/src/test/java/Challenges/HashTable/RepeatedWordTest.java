package Challenges.HashTable;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {

    @Test
    public void repeatedTest() {
        String test = "This is an absolute bananas rest to run against the world and it is a special design and purpose.";
        String result = RepeatedWord.maxWord(test);
        assertEquals("This should be is", "is", result);
    }

    @Test
    public void repeatedBuffalo() {
        String test = "Buffalo buffalo Buffalo buffalo buffalo Buffalo, Buffalo, Buffalo";
        String result = RepeatedWord.maxWord(test);
        assertEquals("Because case sensitive Buffalo", "Buffalo", result);
    }

    @Test
    public void repeatedVoid() {
        String test = "";
        String result = RepeatedWord.maxWord(test);
        assertNull(result);
    }
}