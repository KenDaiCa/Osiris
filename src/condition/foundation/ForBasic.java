package condition.foundation;

import java.util.Scanner;

public class ForBasic {
	
	public void demo01() {
		
		int num, product;
		
		for (num = 1; num <= 5; num++) {
			product = num * 2;
			System.out.println("Value of product = " + product);
		}
		System.out.println("------------------");
	}
	
	
	public void demo02() {
		
		int i, j;
		int max = 10;
		for (i = 0, j = max; i < max; i++, j--) {
			System.out.printf("\n%d + %d = %d", i, j, i + j);
		}
		System.out.println("\n------------------");
		
	}
	
	
	public void demo03() {
		
		int num = 1;
		boolean flag = false;
		
		for (; !flag; num++) {
			System.out.println("Value of num: " + num);
			if (num == 5) {
				flag = true;
			}
			
		}
		System.out.println("\n------------------");
	}
	
	public void demo04() {
		Scanner input = new Scanner(System.in);
		String[] str = new String[1];
		System.out.println("Enter string: ");
		
		for (int i = 0; i < str.length; i++) {
			System.out.printf("Chuoi thu %d: ", i+1);
			str[i] = input.nextLine();
		}
		
		System.out.println("\nList of string: ");
		for (String s : str) {
			System.out.println("String: " + s);
		}
	}
	
	public void demo05() {
		int row, col;
		for (row = 1; row <=5; row++) {
			for (col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		ForBasic f = new ForBasic();
		f.demo01();
		f.demo02();
		f.demo03();
		//f.demo04();
		f.demo05();
	}
	
}
