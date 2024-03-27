package NeetCode.ArraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
* */
public class ValidAnagram242 {
    public static void main(String[] args){
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagramFAST("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        int string1Size = s.length();
        int string2Size = t.length();
        if (string1Size != string2Size)
            return false;
        ArrayList<Character> anagram1 = new ArrayList<>();
        ArrayList<Character> anagram2 = new ArrayList<>();
        for (int i = 0; i < string1Size; i++){
            anagram1.add(s.charAt(i));
            anagram2.add(t.charAt(i));
        }
        Collections.sort(anagram1);
        Collections.sort(anagram2);
        System.out.println(anagram1 + " " + anagram2);
        if (anagram1.equals(anagram2)) //these are not simple data types so we need to
            return true;
        else
            return false;
    }

    public static boolean isAnagramFAST(String s, String t){
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }

}
