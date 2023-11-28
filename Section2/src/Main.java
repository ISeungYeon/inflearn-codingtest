import java.util.*;
public class Main {
	public  ArrayList<Integer> soultion(int n, int arr[]) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		answer.add(arr[0]);
		for(int i =1; i<n; i++) {
			if(arr[i-1] < arr[i])
				answer.add(arr[i]);
		}
		return answer;
		}
		
	public static void main(String [] args) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int [n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int a:m.soultion(n, arr)) {
			System.out.print(a + " ");
		}
	}
}
