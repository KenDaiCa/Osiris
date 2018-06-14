package condition.foundation;

import java.util.Scanner;

public class WhileBasic {
	
	public void demo01() {
		
		int n = 4;
		while (n < 7) {
			System.out.println("Number: " + n);
			n++;
		}
		System.out.println("-------------");
	}
	
	
	public void demo02() {
		
		int n = 5;
		do {
			System.out.println("Do before while: " + n);
		} while (n < 5);
		System.out.println("-------------");
	}
	
	
	public void demo03() {
		
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap mot so trong khoang [1, 10]:  ");
		n = input.nextInt();
		
		while (n <= 1 || n >= 10) {
			System.out.println("So da nhap la: " + n + " khong hop le" + ", vui long nhap lai: ");
			n = input.nextInt();
		}
		System.out.println("-------------");
	}
	
	
	public static void main(String[] args) {
		
		WhileBasic w = new WhileBasic();
		w.demo01();
		w.demo02();
		w.demo03();
		
	}
	
}
