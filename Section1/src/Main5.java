import java.util.*;
public class Main5 {
	public String solution(String str) {
		String answer = "";
		int len = str.length();
		for(int i = 0; i<len; i++){
			if(i == str.indexOf(str.charAt(i)))
					answer += str.charAt(i);
		}
		
		return answer;
		
	}
	public static void main(String [] args) {
		Main5 m = new Main5();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(m.solution(str));
	}
}