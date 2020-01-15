package com.company;

public class reverseIntegers {

    public static int reverseIntegers(int x) {
        int result = 0;

        if(x!=0 && !(x>Integer.MAX_VALUE||x<Integer.MIN_VALUE)){
            String Stringinput = Integer.toString(x);
            String reverse = new StringBuilder(Stringinput).reverse().toString();
            if(reverse.endsWith("0")){
                String[] split = reverse.split("0");
                reverse = split[0];
            }
            if(reverse.endsWith("-")){
                String[] split = reverse.split("-");
                reverse = "-"+split[0];
            }
            try{
                result = Integer.parseInt(reverse);
            }
            catch (NumberFormatException exception){
                return 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int input = 1534236469;
        int output = reverseIntegers(input);
        System.out.println(output);
    }
}
