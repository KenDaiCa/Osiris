package arraylist.foundation;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo01 {
	
	public void printArr() {
		
		ArrayList<String> std = new ArrayList<>();
		std.add("Chu Van An");
		std.add("Dang Van Binh");
		std.add("Duong Kien Quoc");
		std.add("Ha Van Tham");
		std.add("Duong Chi Dung");
		System.out.println("Size of arraylist std: " + std.size());
		System.out.println("Element of array: " + std);
		
		ArrayList<Integer> intArr = new ArrayList<>();
		intArr.add(5);
		intArr.add(7);
		intArr.add(1);
		intArr.add(3);
		System.out.println("\nSize of intArr: " + intArr.size());
		System.out.println("Element of arraylist: " + intArr);
	}
	
	
	public void sortString() {
		
		ArrayList<String> std = new ArrayList<>();
		std.add("Chu Van An");
		std.add("Dang Van Binh");
		std.add("Duong Kien Quoc");
		std.add("Ha Van Tham");
		std.add("Duong Chi Dung");
		
		System.out.println("\nBefore Sort: ");
		for (String stds : std) {
			System.out.println("- " + stds);
		}
		
		System.out.println("After Sort: ");
		Collections.sort(std);
		for (String std2 : std) {
			System.out.println("- " + std2);
		}
	}
	
	
	public void sortInteger() {
		
		ArrayList<Integer> intArr = new ArrayList<>();
		intArr.add(5);
		intArr.add(7);
		intArr.add(1);
		intArr.add(3);
		System.out.println("\nBefore Sort: ");
		for (Integer num : intArr) {
			System.out.println("- " + num);
		}
		System.out.println("After Sort: ");
		Collections.sort(intArr);
		for (Integer nums : intArr) {
			System.out.println("- " + nums);
			
		}
	}
	
	
	public static void main(String[] args) {
		
		ArrayListDemo01 arr = new ArrayListDemo01();
		arr.printArr();
		arr.sortString();
		arr.sortInteger();
	}
	
}
