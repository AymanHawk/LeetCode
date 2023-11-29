package NeetCode.GroupAnagrams49;

import java.util.*;

class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(String word: strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            //System.out.println(chars);
            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }
            //System.out.println(map);

            map.get(sortedWord).add(word);
            System.out.println(map);
        }

        return new ArrayList<>(map.values());

    }

    public static void main(String[] args){
        String[] arr = new String[] { "eat","tea","tan","ate","nat","bat" };
        System.out.println(groupAnagrams(arr));

    }
}