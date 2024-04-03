package main;

import java.util.Arrays;

public class FrequencyOfMostFrequentElement {
    public static void spill(Mug myMug) {
        myMug.setContents("nothing");
    }

    public static void main(String args[]) {
        Mug myMug = new Mug("tea"); // myMug contains "tea"
        System.out.println(myMug.getContents());

        spill(myMug);  // myMug now contains "nothing"
        System.out.println(myMug.getContents());
    }
    public int maxFrequency(int[] nums, int k){
        Arrays.sort(nums);
        int left=0, right = 0, sum = 0, result = 1;
        for ( right = 0; right < nums.length; right++) {
            sum+=nums[right];
            // right - left + 1 is the length of the window (subarray)
            while((right -left + 1) * nums[right] - sum > k){
                sum-=nums[left++];
            }
            result = Math.max(result, right -left + 1);
        }
        return result;
    }
}
 class Mug {

    private String contents;

    public Mug(String contents) {
        this.contents = contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getContents(){
        return contents;
    }
}


