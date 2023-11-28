import java.util.*;
public class Main2 {
	public ArrayList<String> solution(int n, int arr[], int arr2[] ){
		ArrayList<String> answer = new ArrayList<String>();
		for(int i = 0; i<n; i++) {
			if(arr[i] == arr2[i])
				answer.add("D");
			else if(arr[i] == 2 & arr2[i] == 1)
				answer.add("A");
			else if(arr[i] == 1 & arr2[i] == 3)
				answer.add("A");
			else if(arr[i] == 3 & arr2[i] == 2)
				answer.add("A");
			else
				answer.add("B");	
		}
		
		return answer;
	}
	public static void main(String [] args) {
		Main2 m = new Main2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int arr2[] = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i<n; i++) {
			arr2[i] = sc.nextInt();
		}
		for(String a: m.solution(n, arr, arr2)) {
			System.out.println(a);
		}
	}
}
