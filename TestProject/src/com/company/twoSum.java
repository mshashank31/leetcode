package com.company;

public class twoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = new int[]{2,7,5,8};
        int[] output = twoSum(input,13);
        System.out.println(""+output[0]+output[1]);
    }
}
