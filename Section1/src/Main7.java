import java.util.*;
public class Main7 {
	public String solution(String str) {
		String answer = "NO";
		str = str.toLowerCase().replaceAll("[^a-z]", "");
		String s = new StringBuilder(str).reverse().toString();
		if(str.equals(s))
			answer = "YES";
		return answer;
		
	
	}
	public static void main(String [] args) {
		Main7 m =new Main7();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(m.solution(str));
	}
}