package co.java.preparation;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class ParanthesisCheck {

	static boolean areBracketsBalanced(String expr)
    {
        // Using ArrayDeque 
        Deque<Character> stack = new ArrayDeque<Character>();
 
        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);
 
            if (x == '(' || x == '[' || x == '{')
            {
                // Push the element in stack
                stack.push(x);
                continue;
            }
 
            /* If current character is not opening
             cannot be empty at this point.*/
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
 
        // Check Empty Stack
        return (stack.isEmpty());
    }
 
    public static void main(String[] args)
    {
    	System.out.println("Please enter the simple equation:");
        Scanner sc = new Scanner(System.in);
        
    	String expr = sc.nextLine();//"([{}[)";//It can be made to enter by user too
    	sc.close();
 
        // Function call
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }

  }


