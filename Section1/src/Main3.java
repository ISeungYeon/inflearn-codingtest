import java.util.*;
public class Main3 {
	public ArrayList<String> solution3(int n, String [] str){
		ArrayList<String> answer = new ArrayList<String>();
		for(String x: str) {
			String NewAnswer = new StringBuilder(x).reverse().toString();
			answer.add(NewAnswer);
		}
		
		return answer;
	}
	
	public static void main(String [] args) {
		Main3 m =new Main3();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str[] = new String[n];
		for(int i = 0; i<n; i++) {
			 str[i] = sc.next();
		}
		for(String x : m.solution3(n,str)) {
			System.out.println(x);
		}
	}
 	
		
}