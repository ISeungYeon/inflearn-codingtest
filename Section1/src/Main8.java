import java.util.*;
public class Main8 {
	public int solution(String str) {
		int answer = 0;
		str = str.replaceAll("[^0-9]", "");
		answer = Integer.parseInt(str);
		return answer;
	}
	public static void main(String [] args) {
		Main8 m = new Main8();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(m.solution(str));
	}
}
