package main.bank;

import java.util.*;
import java.util.stream.Collectors;

public class UtilityTest{


    public static void main(String[] args) {
       // String[] ch  = {"t","h","e"," ","s","k","y"," ","i","s"," ","b","l","u","e"};
        //https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique/
        //https://leetcode.com/problems/count-good-nodes-in-binary-tree/
        //

        UtilityTest utilityTest = new UtilityTest();


        String s = "bcabc";
        System.out.println(utilityTest.removeDuplicateLetters(s));

    }

    private static double findMedian(int[] nums1, int[] nums2) {
        int sortedArray[]= mergeTwoSortedArrays(nums1, nums2);
        int mid = sortedArray.length/2;
        if(sortedArray.length % 2 == 0){
            return (double) (sortedArray[mid] + sortedArray[mid - 1]) / 2;
        }else{
            return (double) sortedArray[mid];
        }
    }

    private static int[] mergeTwoSortedArrays(int[] nums1, int[] nums2) {
        int result[] = new int[nums1.length + nums2.length];
        int first = 0, second = 0, i = 0;
        while (first < nums1.length && second < nums2.length) {
            if (nums1[first] < nums2[second]) {
                result[i++] = nums1[first++];
            } else {
                result[i++] = nums2[second++];
            }
        }
        while (first < nums1.length) {
            result[i++] = nums1[first++];
        }
        while (second < nums2.length) {
            result[i++] = nums2[second++];
        }
        return result;
    }
    private static void reverseOf(String[] ch, int start, int end) {
        while(start < end){
            String temp = ch[start];
            ch[start++] = ch[end];
            ch[end--] = temp;
        }
    }
    public int maxDistance(List<List<Integer>> arrays) {
        if (arrays == null || arrays.size() < 2)
            return 0;
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size() - 1);
        int result = Integer.MIN_VALUE;

        for (int i = 1; i < arrays.size(); i++) {
            int currMin = arrays.get(i).get(0);
            int currMax = arrays.get(i).get(arrays.get(i).size() - 1);
            int currDis = Math.max(Math.abs(min - currMax), Math.abs(max - currMin));
            result = Math.max(result, currDis);
            min = Math.min(min, currMin);
            max = Math.max(max, currMax);
        }

        return result;
    }

    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++)
            lastIndex[s.charAt(i) - 'a'] = i; // track the lastIndex of character presence
        boolean[] seen = new boolean[26]; // keep track seen
        Stack<Integer> st = new Stack();
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            if (seen[c]) continue; // if seen continue as we need to pick one char only
            while (!st.isEmpty() && st.peek() > c && i < lastIndex[st.peek()])
                seen[st.pop()] = false; // pop out and mark unseen
            st.push(c); // add into stack
            seen[c] = true; // mark seen
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty())
            sb.append((char) (st.pop() + 'a'));
        return sb.reverse().toString();
    }
    }







