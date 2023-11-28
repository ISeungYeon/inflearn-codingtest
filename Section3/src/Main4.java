import java.util.*;
public class Main4 {
	public int Solution(int n) {
		int answer = 0;
		int lt = 1, sum = 0;
		for(int rt = 1; rt<n; rt++) {
			sum += rt;
			if(sum == n)
				answer++;
			while(sum>=n) {
				sum -= lt++;
				if(sum == n)
					answer++;
			}
		}
		 return answer;
	}
	public static void main(String [] args) {
		Main4 m = new Main4();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(m.Solution(n));
	}
}
