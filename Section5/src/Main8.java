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
		int answer = 0; //���� ���� ��� ī����
		Queue<Person> q = new LinkedList<>();
		
		for(int i=0; i<n; i++) {
			q.offer(new Person(i,arr[i]));
		}
		
		while(!q.isEmpty()) {
			Person tmp = q.poll(); //tmp�� ������ �켱 ������ ���Ƽ� ���� ���� ��� ����
			for(Person x : q) {
				if(tmp.priority < x.priority) {
					q.offer(tmp);
					tmp = null; // �켱 ���� �� ���� ����� ������ tmp ���� ����
					break;
				}
			}
			if(tmp!=null) { //tmp�� ������� �ʴٸ� ���� ���� ����� tmp ������ ����ִٴ� ��
				answer++; //���� ���� ���� ��� ī���� �÷��ֱ�
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
