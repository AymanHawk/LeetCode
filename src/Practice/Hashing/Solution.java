package Practice.Hashing;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Solution {
    public static void main(String[] args) {
        hashTableable();
        hashMapable();
        hashSetable();
        concurrentHashable();
        linkedHashMappable();
        linkedHashSettable();
        treeSetDemo();
    }

    static void hashTableable() {
        Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
        hashtable.put(18805, "Farmers BLVD");
        hashtable.put(9032, "Hillside Ave");
        hashtable.put(20543, "Linden BLVD");
        hashtable.put(500, "Elmont Road");

        System.out.println(hashtable);
        //System.out.println(hashtable.get(500));

        /*
         * HashTables are store entries in key-value pairs where the keys are unique
         * Does not allow nulls for both key nor values -> null will return NPE
         * Considered primitive because the HashMaps have more use cases
         * */
    }

    static void hashMapable() {
        //checks for number's frequency in an array of int's
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int[] arr = {10, 34, 5, 10, 3, 5, 10};
        for (int j : arr) {
            Integer count = hashMap.get(j);
            if (hashMap.get(j) == null) {
                hashMap.put(j, 1); // this means that the index is a new number and will be freshly added to the hashmap
            } else {
                hashMap.put(j, ++count); //pre-increment -> will increment index and then return the value
            }
        }
        System.out.println(hashMap);
        /*
         * HashMaps are store entries in key-value pairs where the keys are unique
         * Does allow null values for both keys and values
         * Better performance relative to HashTables bc it's not synchronized
         * */
    }

    static void hashSetable() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Africa");
        hashSet.add("India");
        hashSet.add("Pakistan");
        hashSet.add("Bangladesh");
        hashSet.add("Bangladesh");
        hashSet.remove("Africa");

        //System.out.println(hashSet); //prints from bottom-up

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        /*
         * Stores a collection of unique elements , but does NOT allow duplicate values
         * Allows ONLY one null element
         * Commonly used for checking the existence of elements nad ensuring that no duplicates are present in a collection
         * */
    }

    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //misc
    static void concurrentHashable() {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<Integer, String>();
        map.put(100, "tiger");
        map.put(101, "monkey");
        map.put(102, "zebra");
        map.put(103, "corgi");
        //System.out.println(map);
        map.putIfAbsent(199, "Tester");
        //System.out.println(map);
        map.replace(103, "manatee");
        System.out.println(map);
    }

    static void linkedHashMappable() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        linkedHashMap.put("one", "dell");
        linkedHashMap.put("two", "apple");
        linkedHashMap.put("three", "asus");
        linkedHashMap.put("four", "thinkpad");
        System.out.println("before: " + linkedHashMap);
        System.out.println("Getting value for key 'one': " + linkedHashMap.get("one"));
        System.out.println("Size of the map: " + linkedHashMap.size());
        System.out.println("Is map empty? " + linkedHashMap.isEmpty());
        System.out.println("Contains key 'two'? " + linkedHashMap.containsKey("two"));
        System.out.println("Contains value 'practice.geeks" + "forgeeks.org'? " + linkedHashMap.containsValue("practice" + ".geeksforgeeks.org"));
        System.out.println("delete element 'one': " + linkedHashMap.remove("one"));
        System.out.println(linkedHashMap);

        /*
         * LinkedHashMap remembers the order in which items were added and accessed (insertion order and access order which is configurable)
         * Bc of this, Hashmaps are better performing since it does store that level of info
         * */
    }

    static void linkedHashSettable() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("a");
        linkedHashSet.add("b");
        linkedHashSet.add("c");
        linkedHashSet.add("d");

        //will not add "c" bc already exists in the HashSet
        linkedHashSet.add("c");
        linkedHashSet.add("e");

        System.out.println("Size of LinkedHashSet = " + linkedHashSet.size());
        System.out.println("Original LinkedHashSet:" + linkedHashSet);
        System.out.println("Removing D from LinkedHashSet: " + linkedHashSet.remove("D"));
        System.out.println("Trying to Remove Z which is not " + "present: " + linkedHashSet.remove("Z"));
        System.out.println("Checking if A is present=" + linkedHashSet.contains("A"));
        System.out.println("Updated LinkedHashSet: " + linkedHashSet);
    }

    static void treeSetDemo() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
        System.out.println("--------------- \nTreeSet: " + treeSet);
        // Duplicates will not get insert
        treeSet.add("C");
        // Elements get stored in default natural
        // Sorting Order(Ascending)
        System.out.println("TreeSet: " + treeSet);
        // Checking if A is present or not
        System.out.println("\nTreeSet contains A or not:" + treeSet.contains("A"));
        // Removing items from TreeSet using remove()
        treeSet.remove("A");
        // Printing the TreeSet
        System.out.println("\nTreeSet after removing A:" + treeSet);
        // Iterating over TreeSet items
        System.out.println("\nIterating over TreeSet:");
        Iterator<String> i = treeSet.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
