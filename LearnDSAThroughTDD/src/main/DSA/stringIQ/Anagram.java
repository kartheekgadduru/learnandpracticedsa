package main.DSA.stringIQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Anagram {

    // O(n) time and 256 space
    static boolean areAnagramsUsingAsciiOf(String s1, String s2){
        if(s1.length() != s2.length())
            return false;

        int[] asciiOfChar = new int[256];

        for (int i = 0; i < s1.length(); i++) {
           asciiOfChar[ s1.charAt(i)]++;
           asciiOfChar[s2.charAt(i)]--;
        }
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(asciiOfChar[s1.charAt(i)]);
            if(asciiOfChar[s1.charAt(i)]  >= 1){
                return false;
            }
        }
        return true;
    }
/*static boolean areAnagramsUsingMap(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s1.length(); i++) {
       int count =  map.getOrDefault(s1.charAt(i), 0);
       map.put(s1.charAt(i), count++);
    }
}*/

    /*Find All Anagrams in a String*/
    static List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> pMap = new HashMap<>();
        HashMap<Character, Integer> sMap = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i), 0)+1);
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1);
        }
        int leftPtr = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = p.length(); i < s.length() - p.length() + 1; i++) {
            if(pMap.equals(sMap)){
                list.add(leftPtr);
            }
            sMap.remove(s.charAt(leftPtr));
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1);
            leftPtr++;
        }

return list;
    }


    public static void main(String[] args) {
        String p = "abc";
        String s = "cbaebabacd";
       List<Integer> l =  findAnagrams(s, p);
    }
}
