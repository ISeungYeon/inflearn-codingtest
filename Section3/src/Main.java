import java.util.*;
public class Main {
	public int[] Solution(int n, int a, int arr[], int arr2[]) {
		int answer [] = new int[n+a];
		
		for(int i = 0; i<arr.length; i++) {
			answer[i] = arr[i];
		}
		for(int i = 0; i<arr2.length; i++) {
			answer[i+arr.length] = arr2[i];
		}
		
		Arrays.sort(answer);
		
		return answer;
	}
	public static void main(String [] args) {
		Main m = new Main();
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int a = sc.nextInt();
		
		int arr2[] = new int[a];
		
		for(int i = 0; i<arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		
		for(int x : m.Solution(n, a, arr, arr2)) {
			System.out.print(x + " ");
		}
		
	}
}
