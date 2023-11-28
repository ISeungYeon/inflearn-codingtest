import java.util.*;;
public class Main2 {

	public String solution(String str) {
		String answer = "";
		int lenCount = 0;
		String[]s = str.split(" ");
		for(String t : s) {
			if(lenCount < t.length()) {
				lenCount = t.length();
				answer = t;
			}
		}
		return answer;
	}
	
	public static void main(String [] args) {
		Main2 m2 = new Main2();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(m2.solution(str));
	}
}
