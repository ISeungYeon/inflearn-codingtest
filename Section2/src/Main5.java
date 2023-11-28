import java.util.*;
public class Main5 {
	public boolean isPrime(int a) {
		if(a == 1)
			return false;
		for(int i = 2; i<a; i++) {
			if(a%i == 0)
				return false;
		}
		return true;
	}
	public ArrayList<Integer> solution(int n, int arr[]) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		for(int i =0; i<n; i++) {
			int tmp = arr[i];
			int result = 0;
			
			while(tmp>0) {
				int t = tmp%10;
				result = result * 10 + t;
				tmp = tmp/10;
			}
			
			if(isPrime(result))
				answer.add(result);
		}
		return answer;
	}
	public static void main(String [] args) {
		Main5 m = new Main5();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int c: m.solution(n, arr)) {
			System.out.print(c + " ");
		}
		
		
	}
}
