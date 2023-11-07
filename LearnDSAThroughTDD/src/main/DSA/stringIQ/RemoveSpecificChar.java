package main.DSA.stringIQ;

import java.util.HashSet;
import java.util.List;

public class RemoveSpecificChar {
    public static void main(String[] args) {
        System.out.println(getNewString("kartheek",  'e'));
    }
       static StringBuffer sb = new StringBuffer();
    public static String getNewString(String val , char k){
        if(val.isEmpty()){
            return "";
        }
       if(val.charAt(0) == k){
           getNewString(val.substring(1), k);
       }else{
           sb.append(val.charAt(0));
           getNewString(val.substring(1), k);
       }
        return sb.toString();
    }
    static int getMinimumDistinctCount(int[] a, int[] b, int k){
        HashSet<Integer> setA = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            setA.add(a[i]);
        }
        if(setA.size() == a.length)
            return setA.size();
        for (int j = 0; j < b.length; j++) {
            if(!(setA.contains(b[j])) && setA.size() < a.length && k !=0){
                setA.add(b[j]);
                k-=k;
            }
        }
       return setA.size();
    }
}
