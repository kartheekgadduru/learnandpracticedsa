package main.designpatterns.singleton;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
    /*    String str = "ABC";
        *//*https://leetcode.com/problems/count-unique-characters-of-all-substrings-of-a-given-string/*//*
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                System.out.print(str.substring(i, j+1)+" -> ");
            }
            System.out.println();
        }*/

       /*char[] s =  {"h","e","l","l","o"};

           https://leetcode.com/problems/reverse-string/
*/
        Queue<Integer> queue = new LinkedList<>();

    }
    public void explainCursor(){
        List list = new ArrayList();
        Vector vector = new Vector();
        Enumeration elements = vector.elements();

        LinkedList linkedList = new LinkedList();

        System.out.println(list.iterator().getClass().getName());
        System.out.println(linkedList.iterator().getClass().getName());
        System.out.println(elements.getClass().getName());

    }

    static void iterateUsingIterator(){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer num = iterator.next();
            if(num % 2 == 1){
                iterator.remove();
            }else {
                System.out.println(num);
            }
        }
    }



    //https://leetcode.com/problems/number-of-laser-beams-in-a-bank/
    static String[] findOcurrences(String text, String first, String second) {
        int left = 0, next = 1;
        String[] strings = text.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        while (next < strings.length && next + 1 < strings.length){
            if(strings[left].equals( first) && strings[next].equals(second)){

                list.add(next+1);

            }
            left++;
            next++;
        }
        String[] matchStrings = new String[list.size()];
        for (int i = 0; i < matchStrings.length; i++) {
            matchStrings[i] = strings[list.get(i)];
        }
        return matchStrings;
    }

    public String longestPrefix(String s1, String s2){
        if(s1.isEmpty() || s2.isEmpty())
            return "";
        int left = 0, next = 0;
        while (next < s1.length() && next < s2.length() && s1.charAt(next) == s2.charAt(next)){
            next++;
        }

    return s1.substring(left, next);
    }

    public void m1(String[] strings){
        String result = strings[0];
        for (int i = 0; i < strings.length; i++) {
            result = longestPrefix(result, strings[i]);
        }
        System.out.println(result);


    }





}
