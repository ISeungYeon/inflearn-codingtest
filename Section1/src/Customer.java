import java.util.*;

public class Customer {
	private int customerID; //�� ���̵�
	private String customerName; // �� �̸�
	private String customerGrade; // �� ���
	int bonusPoint; // ���ʽ� ����Ʈ
	double bonusRatio; //��������
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) { // int �Լ��� ������� ������ return �� �־�� ��
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomesinfo() {
		return customerName +  "���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ��" + bonusPoint + "�Դϴ�.";
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
	}
}
