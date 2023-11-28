import java.util.*;
public class Main7 {
	public String Solution(String s, String x) {
		String answer ="YES";
		Queue<Character> q = new LinkedList<>();
		for(char c : s.toCharArray())
			q.offer(c);
		for(char a : x.toCharArray()) {
			if(q.contains(a)) {
				if(a!=q.poll())
					return "NO";
			}
		}
		if(!q.isEmpty())
			return "NO";
		return answer;
	}
	public static void main(String [] args) {
		Main7 m = new Main7();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String x = sc.next();
		System.out.println(m.Solution(s, x));
	}
}
