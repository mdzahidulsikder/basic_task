import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap hm = new HashMap();

        hm.put("Key-01", "Value-01");
        hm.put("Key-02", "Value-02");
        hm.put("Key-03", "Value-03");

        // Display the original map
        System.out.println("Original HashMap: " + hm);

        Set set = hm.entrySet();
        Iterator itr = set.iterator();
      while (itr.hasNext()){
          Map.Entry entry = (Map.Entry) itr.next();
          System.out.println(entry.getKey());

          System.out.println("Original HashMap: " + hm);

          // size() - get the size of the map
          System.out.println("Size of the HashMap: " + hm.size());

          // containsKey(k) - check if a key exists
          System.out.println("Contains Key 'Key-02': " + hm.containsKey("Key-02"));

          // containsValue(v) - check if a value exists
          System.out.println("Contains Value 'Value-04': " + hm.containsValue("Value-04"));

          // get(key) - retrieve a value by key
          System.out.println("Value for 'Key-01': " + hm.get("Key-01"));

          // isEmpty() - check if the map is empty
          System.out.println("Is the HashMap Empty? " + hm.isEmpty());

          // entrySet() - get all key-value pairs as a set
          Set<Map.Entry<String, String>> entrySet = hm.entrySet();
          System.out.println("Key-Value pairs in the HashMap:");
          for (Map.Entry<String, String> entrys : entrySet) {
              System.out.println("Key: " + entrys.getKey() + ", Value: " + entrys.getValue());
          }

          // putAll() - add all elements from another map
          Map<String, String> anotherMap = new HashMap<>();
          anotherMap.put("Key-04", "Value-04");
          anotherMap.put("Key-05", "Value-05");
          hm.putAll(anotherMap);
          System.out.println("HashMap after putAll(): " + hm);

          // remove() - remove an entry by key
          hm.remove("Key-03");
          System.out.println("HashMap after removing 'Key-03': " + hm);

          // replace(k, v) - replace the value for a key
          hm.replace("Key-02", "New-Value-02");
          System.out.println("HashMap after replacing 'Key-02': " + hm);

          // clear() - remove all elements from the map
          hm.clear();
          System.out.println("HashMap after clear(): " + hm);






      }

    }
}
