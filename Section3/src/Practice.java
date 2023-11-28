import java.util.*;
public class Practice {
	public String Solution(String a, String s){
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char d : a.toCharArray()) {
			map.put(d, map.getOrDefault(d, 0)+1);
		}
		
		for(char b : s.toCharArray()) {
			if(!map.containsKey(b) || map.get(b) == 0)
				return "NO";
			map.put(b, map.get(b)-1);
		}
		
		return answer;
	}
	public static void main(String [] args) {
		Practice p = new Practice();
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String s = sc.next();
		
		System.out.println(p.Solution(a,s));
	}
}
