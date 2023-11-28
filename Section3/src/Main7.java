import java.util.*;
public class Main7 {
	public String Solution(String a, String b) {
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c: a.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		
		for(char d: b.toCharArray()) {
			if(!map.containsKey(d) || map.get(d) == 0)
				return "NO";
			map.put(d, map.get(d)-1);
		}
		
		
			
		return answer;
	}
	public static void main(String args []) {
		Main7 m = new Main7();
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(m.Solution(a, b));
	}
}
