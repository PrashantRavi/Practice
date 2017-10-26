package stack;

import java.util.HashMap;
import java.util.Stack;

public class InfixEvaluation
{
    public static int evaluate(String str)
    {

        Stack<Integer> operands = new Stack<Integer>();
 
        Stack<Character> operator = new Stack<Character>();
 
        for (int i = 0; i < str.length(); i++)
        {
        
            if (str.charAt(i) >= '0' && str.charAt(i)<= '9')
            {
            	int a=Character.getNumericValue(str.charAt(i));
                operands.push(a);
            }
            else if (str.charAt(i) == '(')
                operator.push((char) Character.getNumericValue(str.charAt(i)));

            else if (str.charAt(i)== ')')
            {
                while (operator.peek() != '(')
                  operands.push(applyOp(operator.pop(), operands.pop(), operands.pop()));
                operator.pop();
            }

            else if (str.charAt(i) == '+' || str.charAt(i) == '-' ||
            		str.charAt(i) == '*' || str.charAt(i) == '/')
            {
                while (!operator.empty() && calculatePrecedence(str.charAt(i), operator.peek()))
                  operands.push(applyOp(operator.pop(), operands.pop(), operands.pop()));
                operator.push(str.charAt(i));
            }
        }

        while (!operator.empty())
            operands.push(applyOp(operator.pop(), operands.pop(), operands.pop()));

        return operands.pop();
    }

    
    public static boolean calculatePrecedence(char op1, char op2)
    {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        map.put('(', 3);
        map.put(')', 3);
        map.put('+', 2);
        map.put('-', 2);
        map.put('*', 1);
        map.put('/', 1);
        
        return (map.get(op1)>map.get(op2))?false:true;
        
    }

    public static int applyOp(char op, int b, int a)
    {
        switch (op)
        {
        case '+':
            return a + b;
        case '-':
            return a - b;
        case '*':
            return a * b;
        case '/':
            if (b == 0)
                System.out.println("Cannot divide by zero");
            return a / b;
        }
        return 0;
    }

    public static void main(String[] args)
    {
        System.out.println(InfixEvaluation.evaluate("2+4*(5+1)"));
    }
}