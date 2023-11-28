import java.util.*;

public class Customer {
	private int customerID; //고객 아이디
	private String customerName; // 고객 이름
	private String customerGrade; // 고객 등급
	int bonusPoint; // 보너스 포인트
	double bonusRatio; //적립비율
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) { // int 함수를 만들었기 때문에 return 값 있어야 함
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomesinfo() {
		return customerName +  "님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
	}
}
