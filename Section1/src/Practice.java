import java.util.*;
public class Practice {
	public int [] solution(String str, char c) {
		int [] answer = new int[str.length()];
		int p = 1000;
		for(int i =0; i<str.length(); i++) {
			if(str.charAt(i) == c) {
				p = 0;
				answer[i] = p;
			}else {
				p++;
				answer[i] = p;
			}			
		}
		for(int i = str.length()-1; i>=0; i--) {
			if(str.charAt(i) == c) {
				p = 0; //왼쪽으로 갈 때 이미 0을 넣었으므로 answer[i]에 다시 넣을 필요 없음
			}else {
				p++;
				answer[i] = Math.min(answer[i], p); //왼쪽으로 갔을 때 answer[i]와 비교하여 작은 걸 넣어야 하기 때문에
			}
		}
		
		return answer;
	}
	public static void main(String [] args) {
		Practice p =new Practice();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		for(int a: p.solution(str, c)) {
			System.out.print(a + " ");
		}
	}
}
