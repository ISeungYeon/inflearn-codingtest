import java.util.*;
public class Main6 {
	public int Solution(int n, int k) {
		int answer = 0;
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=1; i<=n; i++)
			q.offer(i);
		
		while(!q.isEmpty()) {
			for(int j=1; j<k; j++)
				q.offer(q.poll());
			q.poll();
			if(q.size()==1)
				answer = q.poll();
		}
		return answer;
	}
	public static void main(String [] args) {
		Main6 m = new Main6();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(m.Solution(n, k));
	}
}
