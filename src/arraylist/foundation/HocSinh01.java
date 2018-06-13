package arraylist.foundation;

import java.util.ArrayList;
import java.util.Scanner;

public class HocSinh01 {
	
	private String	ten;
	private int		tuoi;
	
	public String getTen() {
		
		return ten;
	}
	
	
	public void setTen(String ten) {
		
		this.ten = ten;
	}
	
	
	public int getTuoi() {
		
		return tuoi;
	}
	
	
	public void setTuoi(int tuoi) {
		
		this.tuoi = tuoi;
	}
	
	
	public static void main(String[] args) {
		ArrayList<HocSinh01> listHS = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap so luong hoc sinh: ");
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			HocSinh01 hs = new HocSinh01();
			System.out.println("Hoc sinh thu: " + i + ":");
			input.nextLine();
			
			System.out.println("Ten: ");
			String _tenHS = input.nextLine(); // Get gia tri tu ban phim nhap vao
			
			System.out.println("Tuoi: ");
			int _tuoiHS = input.nextInt(); // Get gia tri tu ban phim nhap vao
			
			// add ten+tuoi vao doi tuong hs
			hs.setTen(_tenHS);
			hs.setTuoi(_tuoiHS);
			
			// them doi tuong hs (ten+tuoi) vao danh sach listHS
			listHS.add(hs);
		}
		
		System.out.println("\nDanh sach hoc sinh: ");
		for (int i = 0; i < listHS.size(); i++) {
			System.out.println("Ten: " + listHS.get(i).getTen() + ", Tuoi: " + listHS.get(i).getTuoi());
		}
	}	
}
