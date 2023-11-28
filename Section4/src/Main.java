import java.util.*;
public class Main {
	public char Solution(int n, String s) {
		char answer = ' ';
		HashMap<Character, Integer> map = new HashMap<>();
		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		int max = 0;
		for(char key: map.keySet()) {
			if(map.get(key)>max) {
				max = map.get(key);
				answer = key;
			}
			
		}
		
		return answer;
	}
	public static void main(String [] args) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		System.out.println(m.Solution(n, s));
	}
}
