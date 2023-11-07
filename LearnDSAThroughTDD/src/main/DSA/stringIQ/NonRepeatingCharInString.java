package main.DSA.stringIQ;

import java.util.HashMap;

public class NonRepeatingCharInString {

    // O(n) time and space
    // find first non repeating character in a string
    public static int getFirstUniqueChar(String str){
        if(str.isEmpty()){
            return -1;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < str.length() ; i++) {
            int tem = map.getOrDefault(str.charAt(i),0);
            map.put(str.charAt(i), tem +1);
        }
        for (int i = 0; i < str.length(); i++) {
            if(map.get(str.charAt(i)) == 1)
                return i;
        }
        return-1;
    }
    public static void main(String[] args) {
        int[] num = {1,2,3,4};
        System.out.println(ans(num));
    }
    static String smallestString(String s, char ch){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) > ch){
                String temp = s;
                s = s.substring(0,i);
                s+=ch;
                s+=temp.substring(i,temp.length());
                return s;
            }

        }
        s+=ch;
        return s;
    }

    static int ans(int[] arr){
        int unique = 0;
        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }

}
