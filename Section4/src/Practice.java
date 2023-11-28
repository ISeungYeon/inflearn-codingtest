import java.util.*;

public class Practice {
	public String Solution(String str) {
		String answer ="";
		Stack<Character> st = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if(x == ')') {
				while(st.pop() != ')');
			}else
				st.push(x);
		}
		for(int i=0; i<st.size(); i++) {
			answer += st.get(i);
		}
	
		return answer;
	}
	public static void main(String[] args) {
		Practice p = new Practice();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(p.Solution(str));
		
	}

}
