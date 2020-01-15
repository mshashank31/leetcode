package com.company;

public class removeDuplicates {

    public static int twoSum(int[] nums) {
        int temp = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=temp){
                temp=nums[i];
            }
            else{
                while(nums.length-i>0){
                    nums[i]=nums[i+1];
                    break;
                }
            }
            System.out.println(nums[i]);
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] input = new int[]{0,0,1,1,1,2,2,3,3,4};
        int output = twoSum(input);
        System.out.println(output);
    }
}
