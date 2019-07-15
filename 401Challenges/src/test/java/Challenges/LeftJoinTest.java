package Challenges;

import org.junit.Test;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class LeftJoinTest {

    @Test
    public void leftJoin_exampleTest() {
        Hashtable one = new Hashtable();
        Hashtable two = new Hashtable();

        one.put("fond", "enamored");
        one.put("wrath", "anger");
        one.put("diligent", "employed");
        one.put("outfit", "garb");
        one.put("guide", "usher");

        two.put("fond", "averse");
        two.put("wrath", "delight");
        two.put("diligent", "idle");
        two.put("guide", "follow");
        two.put("flow", "jam");

        Map<Object, List<Object>> leftJoined = LeftJoin.leftJoin(one, two);
        assertEquals("[garb, null]", leftJoined.get("outfit").toString());

    }

    @Test
    public void leftJoin_testSimple() {
        Hashtable one = new Hashtable();
        Hashtable two = new Hashtable();

        one.put("happy", "joyful");

        two.put("happy", "sorrowful");

        Map<Object, List<Object>> leftJoined = LeftJoin.leftJoin(one, two);
        assertEquals("[joyful, sorrowful]", leftJoined.get("happy").toString());
    }

    @Test
    public void leftJoin_testEmpty() {
        Hashtable one = new Hashtable();
        Hashtable two = new Hashtable();
        Map<Object, List<Object>> leftJoined = LeftJoin.leftJoin(one, two);
        assertTrue(leftJoined.isEmpty());
    }
}