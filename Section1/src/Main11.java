import java.util.*;
public class Main11 {
	public String solution(int c, String str) {
		String answer = "";
		for(int i = 0; i<c; i++) {
			String temp = str.substring(0,7).replace("*","0").replace("#","1");
			int a = Integer.parseInt(temp,2);
			answer += (char)a;
			str = str.substring(7);
		}
		return answer;
	}
	public static void main(String [] args) {
		Main11 m = new Main11();
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		String str = sc.next();
		System.out.println(m.solution(c, str));
	}
}
