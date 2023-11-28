import java.util.*;
public class Main5 {
	public int Solution(int n, int k, int arr[]) {
		int answer = -1;
		TreeSet<Integer> tset = new TreeSet<>(Collections.reverseOrder());
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int l=j+1; l<n; l++) {
					tset.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		int count=0;
		
		for(int x : tset) {
			count++;
			if(count == k)
				return x;
		}
		return answer;
	}
	public static void main(String [] args) {
		Main5 m = new Main5();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(m.Solution(n, k, arr));
		
	}
}
