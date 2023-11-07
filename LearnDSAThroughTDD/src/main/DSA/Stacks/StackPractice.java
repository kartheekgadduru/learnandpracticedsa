package main.DSA.Stacks;

import java.util.Arrays;
import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
       int[] num1 = {1,2,-9,12,98,20,13,7,8,9};
       int[] arr = {1,3,2,4};
       int[] arr1 =  { 2, 7, 3, 5, 4, 6, 8 };
            boolean flag = (arr.length == 0) || true;
        }


    /*if stack = empty add -1 into arr
    * s.top() > arr[i] add s.top() into arr
    * s.top() <= arr[i] need do s.pop() then either stack empty or stack.top() > arr[i] (add s.top() to array)
    * */
   /* static int[] getNGE(int arr[]){
        Stack<Integer> stack = new Stack<>();
        int[] nge = new int[arr.length];
        for (int i = arr.length -1 ; i >= 0; i--) {
            if (stack.isEmpty()) {
                nge[i] = -1;
            }else if(stack.size() > 0 && stack.peek() > arr[i]){
                nge[i] = stack.peek();
            }else if(stack.size() > 0 && stack.peek() <= arr[i]){
                while(stack.size() > 0 && stack.peek() <= arr[i]){
                    stack.pop();
                }
                if(stack.size() == 0){
                    nge[i] = -1;
                }else{
                    nge[i] = stack.peek();
                }
            }
            stack.push(arr[i]);
            }
            return nge;
        }*/
    // fill the result array using -1's and follow the other things
    public static int[] findNextGreaterElements(int[] array) {

        if (array == null) {
            return array;
        }

        int[] result = new int[array.length];
        Stack<Integer> stack = new Stack<>();
        Arrays.fill(result, -1);
        for (int i = 0; i < array.length; i++) {
            while (!stack.isEmpty() && array[stack.peek()] < array[i]) {
                result[stack.pop()] = array[i];
            }
            stack.push(i);
        }
        return result;
    }
    }


