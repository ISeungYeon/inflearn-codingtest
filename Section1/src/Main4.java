import java.util.*;
public class Main4 {
	public String solution(String str) {
		String answer= " ";
		char c [] = str.toCharArray();
		int lt = 0;
		int rt = str.length() -1;
		while(lt < rt) {
			if(!(Character.isAlphabetic(c[lt])))
				lt++;
			else if(!(Character.isAlphabetic(c[rt])))
				rt--;
			else {
				char temp = c[lt];
				c[lt] = c[rt];
				c[rt] = temp;
				lt++;
				rt--;
				
			}
		}
		answer = String.valueOf(c);
		return answer;
	}
	public static void main(String [] args) {
		Main4 m = new Main4();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(m.solution(str));
	}
}