import java.util.*;
public class Main6 {
	public int solution(int n, int arr[]) {
		int answer = 0;
		
		int count = 0;
		for(int i = 0; i<n; i++) {
			if(arr[i] == 0)
				count = 0;
			else {
				count++;
				answer = answer + count;
			}
		}
		
		return answer;
	}
	public static void main(String [] args) {
		Main6 m = new Main6();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(m.solution(n, arr));
	}
}
