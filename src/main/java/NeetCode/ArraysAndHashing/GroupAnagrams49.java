package NeetCode.ArraysAndHashing;


/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams49 {
    public static void main(String[] args){
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> group = new HashMap<>();

        for (String word : strs){
            char[] charList = word.toCharArray();
            Arrays.sort(charList);
            String sortedWord = new String(charList);

            if (!group.containsKey(sortedWord)){
                group.put(sortedWord, new ArrayList<>());
            }

            group.get(sortedWord).add(word);
        }

        return new ArrayList<>(group.values());
    }

}
