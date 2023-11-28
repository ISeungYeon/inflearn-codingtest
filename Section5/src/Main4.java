import java.util.*;
public class Main4 {
	public int Solution(String s) {
		int answer=0;
		Stack<Integer> st = new Stack<>();
		
		for(char x: s.toCharArray()) {
			if(Character.isDigit(x)) 
				st.push(x-48);
			else {
				int rt = st.pop();
				int lt = st.pop();
				
				if(x =='+')
					st.push(lt+rt);
				else if(x =='-')
					st.push(lt-rt);
				else if(x == '/')
					st.push(lt/rt);
				else if(x == '*')
					st.push(lt*rt);
			}
			
		}
		
		answer = st.pop();
		
		return answer;
	}
	public static void main(String [] args) {
		Main4 m = new Main4();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(m.Solution(s));
	}
}
