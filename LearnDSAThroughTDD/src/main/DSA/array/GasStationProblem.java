package main.DSA.array;

import java.util.*;

public class GasStationProblem {
    static int atWhatIndexToStart(int gas[], int cost[]){

        int pointer = 0;
        int tankCapacity = 0, total = 0;
        for (int i = 0; i < gas.length; i++) {
           int consume = gas[i] - cost[i];
            tankCapacity+=consume;
           if(tankCapacity < 0){
               pointer+=1;
               tankCapacity =0;
           }
           total+=consume;

        }
        return total <  0 ? -1 : pointer;


    }

    public static void main(String[] args) {
        String str = "kartheek";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.print(str.substring(i, j)+ " ");

            }
            System.out.println();

        }

    }
    static boolean isPerfectSquare(int p1[], int p2[], int p3[], int p4[]){
        int sideP12 = distanceBetween(p1, p2),
         sideP23 = distanceBetween(p2, p3),
         sideP34 = distanceBetween(p3, p4),
         sideP41 = distanceBetween(p4, p1),
         diagonalP13 = distanceBetween(p1, p3),
         diagonalP24 = distanceBetween(p2, p4);

        if(sideP12 == sideP23 && sideP23 == sideP34 && sideP34 == sideP41 && diagonalP13 == diagonalP24){
            return true;
        }
        return false;

    }

    private static int distanceBetween(int[] p1, int[] p2) {
        return (int)Math.sqrt(Math.pow((p1[0] - p2[0]), 2) + Math.pow(p1[1] - p2[1], 2));
    }

    public List<List<Integer>> threeSum(int nums[]){
        Arrays.sort(nums);
        ArrayList<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(i != 0 && nums[i] == nums[i-1]){
                continue;
            }
            int leftPtr = i +1, rightPtr = nums.length -1;
            while (leftPtr < rightPtr){
                int sum = nums[i] + nums[leftPtr] +nums[rightPtr];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[leftPtr], nums[rightPtr]));
                    while (leftPtr < rightPtr && nums[leftPtr] == nums[leftPtr +1]){
                        leftPtr++;
                    }
                    leftPtr++;
                }else if(sum > 0){
                    rightPtr--;
                }else{
                    leftPtr++;
                }
            }
        }
        return result;
    }
}
