package main.DSA.stringIQ;

import java.util.Locale;

public class PalindromeUtils {
    public static void main(String[] args) {
        String str = "kartheek";
        String input = "A man, a plan, a canal: Panama";
        System.out.println(input.length());
        System.out.println(input.toCharArray().length);
        String i = input.replaceAll("[,:\\s]","").toLowerCase();
        System.out.println(i);
    }
    static boolean checkPalindrome(String str){
        String strReplace = str.replaceAll("[^a-zA-Z0-1]","").toLowerCase();
        return isPalindrome(str);
    }

    private static boolean isPalindrome(String str) {
        int left = 0, right = str.length() -1;
        while(left <= right){
            if(str.charAt(left++) != str.charAt(right--)){
                return false;
            }
        }
        return true;
    }


    static int numberOfEditsRequire(String str){
        if(str.isEmpty()){
            return 1;
        }
        int left = 0, right = str.length() -1, count = 0;
        while(left <= right){
            if(str.charAt(left++) != str.charAt(right--)){
                count+=1;
            }
        }
        return count;
    }

    public String longestPalindromeSubstringOf(String str){
        int  n = str.length();
        String result = "";

        for (int i = 0; i < n; i++) {
            String odd = expandString(str, i, i);
            String even = expandString(str, i, i+1);
            if(result.length() < odd.length()){
                result = odd;
            }
            if(result.length() < even.length()){
                result = even;
            }
        }
    return result;
    }

    private String expandString(String str, int left, int right) {
        while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)){
            left--;
            right++;
        }
        return str.substring(left+1, right);
    }

    public int howManySubstrings(String s){


    return -1;
    }



}
