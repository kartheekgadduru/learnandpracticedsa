package main.DSA.stringIQ;

import java.util.ArrayList;

public class SubSequenceOfString {
    public static void main(String[] args) {
        //displayAllSubSeq("abc","");
        System.out.println(getSubSeqOf("abc", ""));
    }
    public static void displayAllSubSeq(String str, String sequence){
        if(str.isEmpty()){
            System.out.println(sequence);
            return;
        }
        char ch = str.charAt(0);
        displayAllSubSeq(str.substring(1), sequence+ch);
        displayAllSubSeq(str.substring(1), sequence);
    }


    public static ArrayList<String> getSubSeqOf(String str, String sequence){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(sequence);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> right = getSubSeqOf(str.substring(1), sequence);
        ArrayList<String> left = getSubSeqOf(str.substring(1), sequence+ch);
        left.addAll(right);
        return left;
    }

}
