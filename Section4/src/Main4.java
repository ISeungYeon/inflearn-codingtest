import java.util.*;
public class Main4 {
	public int Solution(String s, String t) {
		int answer = 0;
		HashMap<Character,Integer> map = new HashMap<>();
		HashMap<Character,Integer> map2 = new HashMap<>();
		
		for(char i :t.toCharArray())
			map.put(i, map.getOrDefault(i, 0)+1);
		
		int l = t.length()-1;
		for(int j =0; j<l; j++) {
			map2.put(s.charAt(j), map2.getOrDefault(s.charAt(j), 0)+1);
		}
		
		int lt = 0;
		
		for(int rt = l; rt<s.length(); rt++) {
			map2.put(s.charAt(rt), map2.getOrDefault(s.charAt(rt), 0)+1);
			if(map2.equals(map))
				answer++;
			map2.put(s.charAt(lt), map2.get(s.charAt(lt))-1);
			if(map2.get(s.charAt(lt)) == 0)
				map2.remove(s.charAt(lt));	
			lt++;
		}
		
		return answer;
	}
	public static void main(String [] args) {
	Main4 m = new Main4();
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	String t = sc.next();
	
	System.out.println(m.Solution(s, t));
	}
	
}
