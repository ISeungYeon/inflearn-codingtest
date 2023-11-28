import java.util.*;
public class Main {
	
	public int solution(String str, char c) {
		int answer = 0;
		str = str.toUpperCase();
		c = Character.toUpperCase(c);
		for(char t : str.toCharArray()) {
			if( c == t )
				answer++;
		}
		return answer;
	}
	
	public static void main(String [] args) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char t = sc.next().charAt(0);
		System.out.println(m.solution(str, t));
		
	}

}
