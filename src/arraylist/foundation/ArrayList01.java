package arraylist.foundation;

import java.util.ArrayList;

public class ArrayList01 {
	
	public static void main(String[] args) {
		ArrayList listHS = new ArrayList<>();
		
		String hs01 = "Nguyen Van A";
		String hs02 = "Nguyen Van B";
		String hs03 = "Nguyen Van C";
		String hs04 = "Nguyen Van D";
		
		listHS.add(hs01);
		listHS.add(hs02);
		listHS.add(hs03);
		listHS.add(hs04);
		
		//Print danh sach phan tu cua mang
		System.out.println("Danh sach hoc sinh : ");
		for (int i = 0; i < listHS.size(); i++) {
			System.out.println(listHS.get(i));
		}
	
		//Add them element vao mang
		String hs05 = "Nguyen Van ABCD";
		listHS.add(2, hs05);
		System.out.println("\nTHEM hoc sinh vao index = 2:  ");
		for (int i = 0; i < listHS.size();  i++) {
			System.out.println(listHS.get(i));
		}
		
		//Change element cua mang
		System.out.println("\nTHAY DOI ten hoc sinh o index = 3:");
		String hs = "Nguyen Van C1";
		listHS.set(3, hs);
		for (int i = 0; i < listHS.size(); i++) {
			System.out.println(listHS.get(i));
		}
		
		//Delete element cua mang
		System.out.println("\nXOA hoc sinh o index = 2 : ");
		listHS.remove(2);
		for (int i = 0; i < listHS.size(); i++) {
			System.out.println(listHS.get(i));
		}
		
		//Delete all elements cua mang
		System.out.println("\nXOA TAT CA cac hoc sinh: ");
		listHS.clear();
		for (int i = 0; i < listHS.size(); i++) {
			System.out.println(listHS.get(i));
		}
		System.out.println("\nDelete successfully");
	}
	
}
