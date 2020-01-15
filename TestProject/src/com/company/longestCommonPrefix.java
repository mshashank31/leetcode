package com.company;

public class longestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length < 1) return "";

        String lcp = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (lcp.length() > strs[i].length()) {
                lcp = strs[i];
            }
        }
        for (int i = 0; i < strs.length; i++) {
            if ("" == lcp || "" == strs[i]) {
                return "";
            }
            else{
                while (lcp.length() > 0) {
                    if (strs[i].startsWith(lcp)) {
                        break;
                    } else {
                        lcp = lcp.substring(0, lcp.length() - 1);
                    }
                }
            }
        }
        return lcp;
    }

    public static void main(String[] args) {
        String[] input = new String[]{"abc","abcd","ab"};
        String output = longestCommonPrefix(input);
        System.out.println(output);
    }
}
