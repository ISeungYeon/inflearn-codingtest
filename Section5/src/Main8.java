import java.util.*;

class Person {
	int id;
	int priority;
	
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
		
	}
}

public class Main8 {
	public int Solution(int n, int M, int arr[]) {
		int answer = 0; //진료 받은 사람 카운팅
		Queue<Person> q = new LinkedList<>();
		
		for(int i=0; i<n; i++) {
			q.offer(new Person(i,arr[i]));
		}
		
		while(!q.isEmpty()) {
			Person tmp = q.poll(); //tmp는 본인이 우선 순위가 높아서 진료 받을 사람 변수
			for(Person x : q) {
				if(tmp.priority < x.priority) {
					q.offer(tmp);
					tmp = null; // 우선 순위 더 높은 사람이 있으면 tmp 변수 비우기
					break;
				}
			}
			if(tmp!=null) { //tmp가 비어있지 않다면 진료 받을 사람이 tmp 변수에 들어있다는 뜻
				answer++; //따라서 진료 받은 사람 카운팅 올려주기
				if(tmp.id == M)
					return answer;
			}
		}
		return answer;
	}
	public static void main(String [] args) {
		Main8 m = new Main8();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int M = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(m.Solution(n, M, arr));
	}
}
