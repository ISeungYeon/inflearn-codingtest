import java.util.*;
public class Main10 {
	public String solution(String str) {
		String answer = "";
		str = str + " "; //str ������ �ε��� �� i+1�� �����Ƿ� ����� �ϳ� �� ������
		int count = 1;
		for(int i =0; i<str.length()-1; i++) { // �� �� ������� i�� ���Ե��� �ʾƾ� �ؼ� str.length()-1
			if(str.charAt(i) == str.charAt(i+1)) {
				count++;
			}else {
				answer += str.charAt(i);
				if(count > 1)
					answer += String.valueOf(count);
				count = 1;
			}
		}
		return answer;
	}
	public static void main(String [] args) {
		Main10 m = new Main10();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(m.solution(str));
	}
}
