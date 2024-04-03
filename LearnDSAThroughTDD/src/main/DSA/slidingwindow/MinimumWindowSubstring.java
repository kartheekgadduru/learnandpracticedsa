package main.DSA.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static void main(String[] args) {

    }
    public String minSubstring(String s, String t){
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);

        }
        int left = 0, right = 0, result = Integer.MAX_VALUE, counter = t.length(), head = 0;
        while(right < s.length()){
            if(map.get(s.charAt(right++)) > 0)
                            counter--;
            while(counter == 0){
                if(right - left < result) {
                    result = right - (head = left);
                }
                Integer temp= map.get(s.charAt(left++));
                if(temp== 0){
                        counter++;
                    }

            }
        }
       return result == Integer.MAX_VALUE ? " " : s.substring(head, result);
    }
}
