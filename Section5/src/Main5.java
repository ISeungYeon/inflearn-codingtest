import java.util.*;
public class Main5 {
	public int Solution(String s) {
		int answer = 0;
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '(')
				st.push('(');
			else {
				st.pop();
				if(s.charAt(i-1) == '(')
					answer += st.size();
				else {
					answer++;
				}
			}
		}
		return answer;
	}
	public static void main(String [] args) {
		Main5 m = new Main5();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(m.Solution(s));
	}
}
