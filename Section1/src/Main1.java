import java.util.Scanner;

public class Main1 {
public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		String answer = "";
		for(char c: str.toCharArray()) {
			if(Character.isUpperCase(c)) {
				answer += Character.toLowerCase(c);
			}
			else
				answer+= Character.toUpperCase(c);
		}
		System.out.println(answer);
		
	}
}
