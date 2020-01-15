package com.company;

public class romanNumerals {

    public static int romanNumerals(String input) {
        int result = 0;
        char[] pieces = input.toCharArray();
        for (int i = 0; i < pieces.length; i++) {
            if(i != pieces.length-1) {
                if (pieces[i] == 'I' && pieces[i + 1] == 'V') {
                    result = result - 1;
                } else if (pieces[i] == 'I' && pieces[i + 1] == 'X') {
                    result = result - 1;
                } else if (pieces[i] == 'X' && pieces[i + 1] == 'L') {
                    result = result - 10;
                } else if (pieces[i] == 'X' && pieces[i + 1] == 'C') {
                    result = result - 10;
                } else if (pieces[i] == 'C' && pieces[i + 1] == 'D') {
                    result = result - 100;
                } else if (pieces[i] == 'C' && pieces[i + 1] == 'M') {
                    result = result - 100;
                } else if (pieces[i] == 'I') {
                    result = result + 1;
                } else if (pieces[i] == 'V') {
                    result = result + 5;
                } else if (pieces[i] == 'X') {
                    result = result + 10;
                } else if (pieces[i] == 'L') {
                    result = result + 50;
                } else if (pieces[i] == 'C') {
                    result = result + 100;
                } else if (pieces[i] == 'D') {
                    result = result + 500;
                } else if (pieces[i] == 'M') {
                    result = result + 1000;
                }
            }
            else{
                if (pieces[i] == 'I') {
                    result = result + 1;
                } else if (pieces[i] == 'V') {
                    result = result + 5;
                } else if (pieces[i] == 'X') {
                    result = result + 10;
                } else if (pieces[i] == 'L') {
                    result = result + 50;
                } else if (pieces[i] == 'C') {
                    result = result + 100;
                } else if (pieces[i] == 'D') {
                    result = result + 500;
                } else if (pieces[i] == 'M') {
                    result = result + 1000;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "MCMXCIV";
        int output = romanNumerals(input);
        System.out.println(output);
    }
}
