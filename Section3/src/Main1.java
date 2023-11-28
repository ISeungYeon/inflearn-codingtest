import java.util.*;
public class Main1 {
	public ArrayList <Integer> Solution(int n, int a, int arr[], int arr2[]) {
		ArrayList <Integer> answer = new ArrayList <Integer>();
		
		Arrays.sort(arr);
		Arrays.sort(arr2);
		
		int pi =0, pj = 0;
		
		while(pi<n && pj<a) {
			if(arr[pi] == arr2[pj]) {
				answer.add(arr[pi++]);
				pj++;
			}
			else if(arr[pi] < arr2[pj])
				pi++;
			else
				pj++;
		}
		
		return answer;
	}
	public static void main(String [] args) {
		Main1 m = new Main1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0 ; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int a = sc.nextInt();
		int arr2[] = new int[a];
		for(int i =0 ; i<a; i++) {
			arr2[i] = sc.nextInt();
		}
		for(int x: m.Solution(n, a, arr, arr2)) {
			System.out.print(x + " ");
		}
		
		
	}
}
