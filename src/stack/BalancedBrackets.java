package stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int tc = scan.nextInt();
		for(int i=0 ; i<tc; i++) {
			Stack<Character> stack = new Stack<>();
			String str = scan.next();
			stack.push('$');
			for(int j=0; j<str.length(); j++) {
				Character chTemp = str.charAt(j);
				if(stack.peek() == '(' && chTemp == ')' || stack.peek() == '[' && chTemp == ']' || stack.peek() == '{' && chTemp == '}') {
					stack.pop();
				}
				else {
					stack.push(chTemp);
				}
			}
			if(stack.peek() == '$') {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		scan.close();
	}

}
