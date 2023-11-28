import java.util.*;

class People {
	int id;
	int priority;
	
	public People(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}

public class Practice {
	public int Solution(int n, int m, int arr[]) {
		int answer = 0;
		
		Queue<People> q = new LinkedList<>();
		
		for(int i=0; i<n; i++) {
			q.offer(new People(i, arr[i]));
		}
		
		while(!q.isEmpty()) {
			People tmp = q.poll();
			for(People x : q) {
				if(tmp.id < x.id) {
					q.offer(tmp);
					tmp = null;
					break;
				}
			}
			
			if(tmp != null) {
				answer++;
				if(tmp.id == m)
					return answer;
	
			}
			
		}
		
		return answer;
	}
	public static void main(String [] args) {
		Practice p = new Practice();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(p.Solution(n, m, arr));
	}
}