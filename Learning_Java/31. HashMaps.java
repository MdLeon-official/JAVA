import java.util.HashMap;

public class Main {
    public static void main(String[] args ) {
        // HashMap = A data structure that stores key-value pairs.
        // keys are unique but values can be duplicated.
        // Doesnt maintain order of elements.
        // HashMap<KeyType, ValueType> map = new HashMap<>();

        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);

        map.remove("A");

        System.out.println("Map: " + map);
        System.out.println("Size: " + map.size());
        System.out.println(map.get("B")); // Returns the value associated with key "B"
        System.out.println(map.containsKey("C")); // Returns true if key "C" exists
        System.out.println(map.containsValue(4)); // Returns true if value 4 exists
        System.out.println(map.isEmpty()); // Returns true if the map is empty

        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
