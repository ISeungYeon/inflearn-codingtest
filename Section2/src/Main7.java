import java.util.*;
public class Main7 {
	public int [] solution(int n, int arr[]){
		int [] answer = new int[n];
		
		for(int i = 0; i<n; i++) {
			int count = 1;
			for(int j = 0; j<n; j++) {
				if(arr[j]>arr[i]) {
					count++;
					answer[i] = count;
				}
				answer[i] = count;
			}
		}
		
		return answer;
	}
	public static void main(String [] args) {
		Main7 m = new Main7();
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int a : m.solution(n, arr)) {
			System.out.print(a +" ");
		}
		
	}
}
