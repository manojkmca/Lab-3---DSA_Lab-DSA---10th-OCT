package com.GreatLearning.FindLongestPath;

import java.util.Stack;

public class BracketBalancing {
    public static void main (String [] args)
    {
        String balanced = "([[{}]])";
        String not_balanced = "([[{}]]))";

        System.out.println(checkBalanced(balanced));
        System.out.println(checkBalanced(not_balanced));
    }

    public static boolean checkBalanced(String check)
    {
        Stack<Character> S = new Stack<Character>();
        for(int a = 0; a < check.length(); a++)
        {
            char let = check.charAt(a);
            if(let == '[' || let == '{' || let == '(')
                S.push(let);
            else if(let == ']' || let == '}' || let == ')')
            {
                if(S.empty())
                    return false;
                switch(let)
                {
                    // Opening square brace
                    case ']':
                        if (S.pop() != '[')
                            return false;
                        break;
                    // Opening curly brace
                    case '}':
                        if (S.pop() != '{')
                            return false;
                        break;
                    // Opening paren brace
                    case ')':
                        if (S.pop() != '(')
                            return false;
                        break;
                    default:
                        break;
                }
            }
        }
        if(S.empty()) {
        	System.out.println("The entered String has Balanced Brackets");
        	 return true;
        }
        else {
        	System.out.println("The entered Strings do not contain Balanced Brackets");
            return false;
        }
    
    }
}