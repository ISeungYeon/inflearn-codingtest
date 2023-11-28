import java.util.*;

public class Main {
	public String Solution(String str) {
		String answer = "YES";
		Stack<Character> st = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if(x == '(')
				st.push('(');
			else {
				if(st.isEmpty())
					return "NO";
				st.pop();
			}	
		}
		
		if(!st.isEmpty())
			return "NO";
			
			
		
		return answer;
	}
	
	public static void main(String [] args) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(m.Solution(str));
		
		
	}
}
