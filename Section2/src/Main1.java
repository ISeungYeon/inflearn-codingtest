import java.util.*;
public class Main1 {
	public  int soultion(int n, int arr[]) {
		int answer = 1;
		int save = arr[0];
		for(int i = 1; i<n; i++) {
			if(save < arr[i]) {
				save = arr[i];
				answer++;
			}
		}
		return answer;
	}
	public static void main(String [] args) {
		Main1 m = new Main1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int [n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(m.soultion(n, arr));
	}
}
