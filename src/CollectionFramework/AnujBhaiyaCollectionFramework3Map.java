package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class AnujBhaiyaCollectionFramework3Map {
    public static void main(String[] args) {
        // map methods

        // put(k,v) ->adding, overwrites if already present
        // putAll() ->insert all from specified map to this map
        // putIfAbsent -> insert if key doesnt have value v
        // get(k)-> returns value for key k, if not found returns null
        // getOrDefault(k, defaultValue) -> gives default value if key is not present instead of null
        // containsKey(k)
        // containsValue(v)-> check for value
        // replace(k,v) -> replace value of key k with v
        // replace(k, oldVal, newVal) -> replace value of key k with newVal if its value is oldVal
        // remove(k) -> remove key k
        // remove(k,v) -> remove key k if its value is v
        // keySet() -> gives a set of all present in a map
        // values() -> gives a set of all values present in a map
        // entry set -> return set of all key value mapping

        Map<String, String> mp = new HashMap<>();

        mp.put("us", "United States");
        mp.put("in", "India");
        mp.put("in", "India2"); // if key is already present map replaces it
        mp.put("en", "England");

        System.out.println(mp);

        mp.remove("en");

        System.out.println(mp.containsKey("pn"));

        System.out.println(mp.get("in"));
    }
}
