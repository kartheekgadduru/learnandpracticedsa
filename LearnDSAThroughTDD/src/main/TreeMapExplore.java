package main;

import main.bank.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class TreeMapExplore {
    public static void main(String[] args) {
        TreeMap<String, Number> map = new TreeMap<String, Number>();
        List<String> list = Arrays.asList("Kartheek", "Tuna","Veena", "Anna", "Sen", "Veena","Tuna", "Kartheek");
        Map<String, Integer> hashMap = new LinkedHashMap<>();
        for (String s : list) {
            hashMap.put(s, Collections.frequency(list, s));
        }
        System.out.println(hashMap);

    }
}
