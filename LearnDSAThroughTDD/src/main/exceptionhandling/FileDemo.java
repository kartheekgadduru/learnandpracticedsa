package main.exceptionhandling;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        boolean newFile = false;
        File file = new File("sample.txt");  // file is not being created
        System.out.println(file.exists()); // prints false
        newFile = file.createNewFile(); // assigns true for the fist time and create new file
        System.out.println("newFile created :: "+newFile);
        System.out.println("look for file  :: "+file.exists());
        List<Integer> num = Arrays.asList(12,1,2,31,21);
        List<Integer> evenNum = num.stream()
                                            .filter((ele) -> ele % 2 == 0)
                                            .collect(Collectors.toList());
        System.out.println(evenNum);
        System.out.println(num);
        List<Integer> oddNum = num.stream().filter((ele) -> ele % 2 == 1).map(n -> n * 2).collect(Collectors.toList());
        System.out.println("oddNum doubled :: "+ oddNum);

    }
}
