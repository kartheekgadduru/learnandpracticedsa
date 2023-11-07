package main.DSA.stringIQ;

import java.util.ArrayList;

public class Dice {

    public static void main(String[] args) {
        /*dice("",10);*/
        System.out.println(diceInList("",6).size());
        System.out.println(diceCount("",6));
    }
     static void dice(String p, int target) {
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p+i, target - i);
        }
    }

    static ArrayList<String> diceInList(String p, int target){
        if(target == 0){
            ArrayList<String> fnList = new ArrayList<>();
            fnList.add(p);
            return fnList;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(diceInList(p + i , target -i));
        }
        return ans;
    }
    static int diceCount(String p , int target){
        if(target == 0 ){
            return 1;
        }
        int count = 0;
        for (int i = 1 ; i <= 6 && i <= target ; i++) {
            count = count + diceCount(p + i, target - i);

        }
        return count;
    }

}
