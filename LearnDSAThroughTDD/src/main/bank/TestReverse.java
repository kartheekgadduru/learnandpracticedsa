package main.bank;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class TestReverse {
    public static void main(String[] args) {
        String s = "kart";
        int[] num = {1,2,-9,12,98,20,13,7,8,9};
    }

    public String addBinary(String a, String b) {
        int aLen = a.length() -1, bLen = b.length() -1, carry = 0;
        String result = "";
        while(aLen >= 0 || bLen >= 0 || carry != 0){
            int tempA = aLen >= 0 ? a.charAt(aLen--) - '0' : 0;
            int tempB = bLen >= 0 ? a.charAt(bLen--) - '0' : 0;
           int  sum = tempB+ tempA + carry;

           result = sum % 2 + result;
           carry = sum / 2;

        }
        return result;

    }




    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int first = 0, last = nums.length -1;
        List<Integer> list = new ArrayList<>();
        while(first <= last){
            int mid = first + (last - first)/2;
            if(nums[mid] == target && nums[mid+1] >= target){
                list.add(mid);
                last = mid -1;
            }else if(nums[mid] > target){
                last = mid -1;
            }else{
                first = mid+ 1;
            }

        }

        Collections.sort(list);
        return list;
    }
    public static int searchInsert(int[] nums, int target) {
        int first = 0, last = nums.length -1;
        while(first < last){
            int mid = first +( last - first)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                first = mid+1;
            else
                last = mid -1;
        }
        return first;
    }
    public boolean workPattern(String pattern, String s ){
        String[] strArr = s.split(" ");
        if(pattern.length() != strArr.length)
            return false;
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(pattern.charAt(i))){
                if(map.get(pattern.charAt(i)) != strArr[i]){
                    return false;
                }
            }else{
                map.put(pattern.charAt(i), strArr[i]);
            }

        }

        return true;
    }



    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length())
            return false;

        return isSubsequence(s, t, s.length(), t.length());

    }

    public boolean   isSubsequence(String s, String t, int sIndex, int tIndex){
        if(sIndex == 0)
            return true;
        if(tIndex == 0)
            return false;

        if(s.charAt(sIndex) == t.charAt(tIndex))
            return isSubsequence(s, t, sIndex -1, tIndex -1);
        else
            return isSubsequence(s, t, sIndex, tIndex -1);

    }
    public String addStrings(String num1, String num2) {  // you learnt unknown concept
            int i = num1.length() -1, j = num2.length() -1, carry = 0;
            String result = "";
            while(i >=0 || j >= 0 || carry != 0){
                int iVal = i >= 0 ? num1.charAt(i) - '0' : 0;
                int jVal = j >= 0 ? num2.charAt(j) - '0' : 0;
                i--;
                j--;
                int sum = iVal + jVal + carry;
                result= sum % 10 + result ;
                carry = sum /10;
            }
            return result;
    }


    public String simplifyPath(String path) {
        Stack<String> stack = new Stack();
        for (String token : path.split("/")) {
            if (!stack.isEmpty() && "..".equals(token))
                stack.pop();
            else if (!Arrays.asList(".", "", "..").contains(token))
                stack.push(token);
        }

        return "/" + String.join("/", stack);
    }


}



