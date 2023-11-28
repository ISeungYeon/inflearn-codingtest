import java.util.*;
public class Practice {
	
	public int solution(int N, int M, int arr[][]){
		int answer = 0;
		for(int i = 1; i<=N; i++ ) {
			for(int j =1; j<=N; j++) {
				int count = 0;
				for(int k = 0; k<M; k++) {
					int pi = 0, pj = 0;
					for(int s = 0; s<N; s++) {
						if(arr[k][s] == i)
							pi = s;
						if(arr[k][s] == j)
							pj = s;
					}
					if(pi < pj)
						count++;
				}
				if(count == M)
					answer++;
			}
		}
		
		return answer;
	}
	public static void main(String [] args) {
		Practice p = new Practice();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[][] = new int[M][N];
		
		for(int i = 0; i<M; i++) {
			for(int j = 0; j<N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(p.solution(N, M, arr));
	}
}