import java.util.*;

public class Main2 {
	public String Solution(String str) {
		String answer = "";
		Stack<Character> st = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if(x == ')') {
				while(st.pop() != '(');
			}else
				st.push(x);
		}
		
		for(int i=0; i<st.size(); i++) {
			answer += st.get(i);
		}
		return answer;
	}
	public static void main(String [] args) {
		Main2 m = new Main2();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(m.Solution(str));
	}
}
