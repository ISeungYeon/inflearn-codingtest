import java.util.*;
public class Main6 {
	public String solution(String str) {
		String answer= "YES";
		str = str.toLowerCase();
		int len = str.length();
		for(int i = 0; i< len/2; i++) {
			if(!(str.charAt(i) == str.charAt(len-i-1)))
				return "NO";
		}
		return answer;
	}
	public static void main(String [] args) {
		Main6 m = new Main6();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(m.solution(str));
	}
}
