package main.DSA.stringIQ;

import java.util.ArrayList;

public class Permutations {

    public static void permutations(String p, String unp){
        if(unp.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = unp.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String firstStr = p.substring(0,i);
            String remainingStr = p.substring(i, p.length());
            permutations(firstStr + ch + remainingStr, unp.substring(1));
        }

    }

    public static void main(String[] args) {
        permutations("","abc");
     //   System.out.println( permutationInList("","abc"));
       System.out.println( countNoOfPermuations("","abc"));
    }
    public static ArrayList<String> permutationInList(String p, String unp){
        if(unp.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
             list.add(p);
             return list;
        }
        char ch = unp.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String firstStr = p.substring(0, i);
            String remainingStr = p.substring(i, p.length());
            ans.addAll(permutationInList(firstStr + ch + remainingStr, unp.substring(1)));
        }
        return ans;
    }
    public static int countNoOfPermuations(String p, String unp){
        if(unp.isEmpty()){
            return 1;
        }
        char ch = unp.charAt(0);
        int count = 0;
        for (int i = 0; i <= p.length(); i++) {
            String firstStr = p.substring(0, i);
            String remainingStr = p.substring(i, p.length());
            count  = count + countNoOfPermuations(firstStr + ch + remainingStr, unp.substring(1));

        }
        return count;
    }
}
