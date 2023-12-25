package project6;

package project9;

import java.util.HashMap;
import java.util.Map;

public class MapVerification {

    public static void main(String[] args) {
        
        Map<String, Integer> map = createAndInitializeMap();
        printMap("Initialized Map:", map);

       
        updateMap(map, "Two", 20);
        printMap("Updated Map:", map);

      
        int value = accessMap(map, "Three");
        System.out.println("Accessed Value for Key 'Three': " + value);

    
        traverseMap(map);

      
        removeEntry(map, "One");
        printMap("Map after Removing Key 'One':", map);

     
        int size = getMapSize(map);
        System.out.println("Size of the Map: " + size);
    }

  
    private static Map<String, Integer> createAndInitializeMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 10);
        map.put("Two", 15);
        map.put("Three", 30);
        return map;
    }

    
    private static void updateMap(Map<String, Integer> map, String key, int value) {
        map.put(key, value);
    }

    
    private static int accessMap(Map<String, Integer> map, String key) {
        return map.getOrDefault(key, -1);
    }

    
    private static void traverseMap(Map<String, Integer> map) {
        System.out.println("Traversed Map:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Function to remove an entry from the map
    private static void removeEntry(Map<String, Integer> map, String key) {
        map.remove(key);
    }

    // Function to get the size of the map
    private static int getMapSize(Map<String, Integer> map) {
        return map.size();
    }

    // Function to print the entries of the map
    private static void printMap(String message, Map<String, Integer> map) {
        System.out.println(message);
        traverseMap(map);
    }
}

