import java.util.*;
public class Main2 {
	public int Solution(int n, int k, int arr[]) {
		int answer = 0;
		int sum =0;
		for(int i = 0; i<k; i++) 
			sum += arr[i];
		answer = sum;
		
		for(int j = k; j<n; j++) {
				sum+=arr[j]-arr[j-k];
				answer = Math.max(answer, sum);
			}
		
		
		return answer;
	}
	public static void main(String [] args) {
		Main2 m = new Main2();
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(m.Solution(n, k, arr));
	}
}
