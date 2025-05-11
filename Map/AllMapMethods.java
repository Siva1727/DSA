import java.util.*;

public class AllMapMethods {
    public static void main(String[] args) {
        // Create a Map
        Map<String, String> map = new HashMap<>();

        // put() - Add entries
        map.put("101", "Alice");
        map.put("102", "Bob");
        map.put("103", "Charlie");

        // get() - Retrieve value using key
        System.out.println("Value for key 102: " + map.get("102"));

        // containsKey() - Check if key exists
        System.out.println("Contains key 101? " + map.containsKey("101"));

        // containsValue() - Check if value exists
        System.out.println("Contains value 'David'? " + map.containsValue("David"));

        // remove() - Remove entry by key
        map.remove("103");
        System.out.println("After removing key 103: " + map);

        // isEmpty() - Check if map is empty
        System.out.println("Is the map empty? " + map.isEmpty());

        // size() - Get number of entries
        System.out.println("Size of map: " + map.size());

        // keySet() - Get all keys
        System.out.println("Keys in map: " + map.keySet());

        // values() - Get all values
        System.out.println("Values in map: " + map.values());

        // entrySet() - Get all key-value pairs
        System.out.println("Entries in map:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // clear() - Remove all entries
        map.clear();
        System.out.println("Map after clear(): " + map);
    }
}
