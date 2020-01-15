package com.company;

import java.util.Stack;

public class validParenthesis {

    public static boolean validParenthesis(String strs) {
        Stack myStack = new Stack();
        boolean output = false;
        if(strs.isEmpty()){
            output=true;
        }
        else {
            for (int i = 0; i < strs.length(); i++) {
                if (strs.charAt(i) == '{' || strs.charAt(i) == '[' || strs.charAt(i) == '(') {
                    myStack.push(strs.charAt(i));
                } else if (!myStack.isEmpty() && ((strs.charAt(i) == '}' && myStack.lastElement().toString().charAt(0) == '{') || (strs.charAt(i) == ']' && myStack.lastElement().toString().charAt(0) == '[') || (strs.charAt(i) == ')' && myStack.lastElement().toString().charAt(0) == '('))) {
                    myStack.pop();
                    if (myStack.isEmpty()&&i==strs.length()-1) {
                        return true;
                    }
                } else {
                    return false;
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String input = "[])";
        boolean output = validParenthesis(input);
        System.out.println(output);
    }
}
