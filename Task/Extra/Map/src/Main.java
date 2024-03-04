import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, String> map = new HashMap<>();

        // put(k, v) - to add values
        map.put("Key-01", "value-01");
        map.put("Key-02", "value-02");
        map.put("Key-03", "value-03");

        // Display the original map
        System.out.println("Original Map: " + map);

        // size() - get the size of the map
        System.out.println("Size of the Map: " + map.size());

        // containsKey(k) - check if a key exists
        System.out.println("Contains Key 'Key-02': " + map.containsKey("Key-02"));

        // containsValue(v) - check if a value exists
        System.out.println("Contains Value 'value-04': " + map.containsValue("value-04"));

        // get(key) - retrieve a value by key
        System.out.println("Value for 'Key-01': " + map.get("Key-01"));

        // isEmpty() - check if the map is empty
        System.out.println("Is the Map Empty? " + map.isEmpty());

        // entrySet() - get all key-value pairs as a set
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        System.out.println("Key-Value pairs in the Map:");
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // putAll() - add all elements from another map
        Map<String, String> anotherMap = new HashMap<>();
        anotherMap.put("Key-04", "value-04");
        anotherMap.put("Key-05", "value-05");
        map.putAll(anotherMap);
        System.out.println("Map after putAll(): " + map);

        // remove(k) - remove an entry by key
        map.remove("Key-03");
        System.out.println("Map after removing 'Key-03': " + map);

        // replace(k, v) - replace the value for a key
        map.replace("Key-02", "new-value-02");
        System.out.println("Map after replacing 'Key-02': " + map);

        // clear() - remove all elements from the map
        map.clear();
        System.out.println("Map after clear(): " + map);
    }
}
