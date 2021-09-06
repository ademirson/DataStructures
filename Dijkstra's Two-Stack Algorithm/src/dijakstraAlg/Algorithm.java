package dijakstraAlg;

import java.util.Scanner;

public class Algorithm {

	public static void main(String[] args)  {
			
		
		StackFromArray<Double> values=new StackFromArray<Double>();
		StackFromArray<String> operators=new StackFromArray<String>();
		System.out.println("Enter an arithmetic expression");
		Scanner expr=new Scanner(System.in);
		String[] expression = expr.nextLine().split(" ");
		
		for(int i=0;i<expression.length;i++) {
			if(expression[i].equals("+")) operators.push(expression[i]);
			else if(expression[i].equals("-")) operators.push(expression[i]);
			else if(expression[i].equals("*")) operators.push(expression[i]);
			else if(expression[i].equals("/")) operators.push(expression[i]);
			else if(expression[i].equals("%")) operators.push(expression[i]);
			else if(expression[i].equals("^")) operators.push(expression[i]);
			else if(expression[i].equals("(")) continue;
			else if(expression[i].equals(")")) {
				
				String operator=operators.pop();
				double value=values.pop();
				
				if(operator.equals("+"))   value=values.pop()+(value);
				else if(operator.equals("-"))   value=values.pop()-(value);
				else if(operator.equals("*"))   value=values.pop()*(value);
				else if(operator.equals("/"))   value=values.pop()/(value);
				else if(operator.equals("%"))   value=values.pop()%(value);
				else if(operator.equals("^"))   value=Math.pow(values.pop(), value);
				values.push(value);
				
			}
			else values.push(Double.parseDouble(expression[i]));
		}
		 System.out.println(values.pop());

	}
}



