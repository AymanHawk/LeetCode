package Practice.Hashing;

import java.util.HashMap;
import java.util.Hashtable;

public class Solution {
    public static void main(String[] args){
        hashTableable();
        hashMapable();
    }

     static void hashTableable(){
        Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
        hashtable.put(18805, "Farmers BLVD");
        hashtable.put(9032, "Hillside Ave");
        hashtable.put(20543, "Linden BLVD");
        hashtable.put(500, "Elmont Road");

        System.out.println(hashtable);
        System.out.println(hashtable.get("Farmers BLVD"));
    }

    static void hashMapable(){
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int[] arr = { 10, 34, 5, 10, 3, 5, 10 };

        for(int i: arr){
            Integer count = hashMap.get(arr[i]);
            if(hashMap.get(arr[i]) == null){
                hashMap.put(arr[i], 1);
            }else{
                hashMap.put(arr[i], ++count); //pre-increment -> will increment index and then return the value
            }
        }
        System.out.println(hashMap);
    }
}
