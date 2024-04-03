package main.bank;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class ListHighest {
    public static void main(String[] args) throws IOException {
      List<Integer> list = new ArrayList<>();
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);
      list.add(40);
      List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());

        Optional<Integer> secondHighest = list.stream().distinct().sorted((a, b) -> Integer.compare(b, a))
                .skip(1)
                .findFirst();




    }
}
