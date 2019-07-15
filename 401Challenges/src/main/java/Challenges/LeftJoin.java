package Challenges;

import java.util.*;

public class LeftJoin {
    public static Map<Object, List<Object>> leftJoin(Hashtable one, Hashtable two) {
        Map<Object, List<Object>> result = new HashMap<>();
        for (Object key : one.keySet()) {
            List<Object> join = new ArrayList<>();
            join.add(one.get(key));
            join.add(two.get(key));
            result.put(key, join);
        }
        return result;
    }
}
