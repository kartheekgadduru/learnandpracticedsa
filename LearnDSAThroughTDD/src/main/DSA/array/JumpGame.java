package main.DSA.array;


/*https://leetcode.com/problems/jump-game/
        Input: nums = [2,3,1,1,4]
        Output: true
        Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.*/
public class JumpGame {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2,3,1,1,4}));
    }
    public static boolean canJump(int arr[]){
        int reachable = 0;
        int n = arr.length -1;

        for (int i = 0; i < n && reachable >= i; i++) {
            reachable = Math.max(reachable, i + arr[i]);
            if(reachable >= n) return true;
        }
        return false;
    }
}
