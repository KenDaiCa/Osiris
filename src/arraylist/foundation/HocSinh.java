package arraylist.foundation;

import java.util.ArrayList;

public class HocSinh {
	public String ten;
	public int tuoi;
	
	public static void main(String[] args) {
		ArrayList<HocSinh> listHS = new ArrayList<>();
		
		//Khoi tao hs
		HocSinh hs01 = new HocSinh();
		hs01.ten = "Nguyen Van A";
		hs01.tuoi = 13;
		
		HocSinh hs02 = new HocSinh();
		hs02.ten = "Nguyen Van B";
		hs02.tuoi = 14;
		
		HocSinh hs03 = new HocSinh();
		hs03.ten = "Nguyen Van C";
		hs03.tuoi = 15;
		
		//THEM doi tuong hoc sinh vao listHS
		listHS.add(hs01);
		listHS.add(hs02);
		listHS.add(hs03);
		
		System.out.println("Danh sach hoc sinh hien tai: ");
		for (int i = 0; i < listHS.size(); i++) {
			System.out.println("Ten: " + listHS.get(i).ten + ", Tuoi: " + listHS.get(i).tuoi);
			
		}
		
		
	}
	
}
