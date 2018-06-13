package arraylist.foundation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SinhVien {
	
	String	hoTen;
	int		diemSo;
	
	
	public static void main(String[] args) {
		
		/**
		 * Nhap du lieu tu ban phim
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap danh sach sinh vien: ");
		int n = input.nextInt();
		
		// Khoi tao danh sach Sinh Vien
		ArrayList<SinhVien> listSV = new ArrayList<>();
		
		/**
		 * Nhap thong tin sinh vien tu ban phim
		 */
		for (int i = 0; i < n; i++) {
			input.nextLine();
			
			SinhVien sv = new SinhVien(); // Khoi tao doi tuong sinh vien
			System.out.println("Thong tin sinh vien thu: " + i);
			System.out.println("Ho va Ten: ");
			sv.hoTen = input.nextLine();
			System.out.println("Diem So: ");
			sv.diemSo = input.nextInt();
			
			// Them sinh vien day du thong tin va danh sach sinh vien
			listSV.add(sv);
		}
		//Sap xep danh sach sinh vien theo diem so
		Collections.sort(listSV, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien sv01, SinhVien sv02) {
				if (sv01.diemSo < sv02.diemSo) {
					return 1;
				}else {
					if (sv01.diemSo == sv02.diemSo) {
						return 0;
					}else {
						return -1;
					}
				}
			}});
		
		System.out.println("\nDanh sach sinh vien theo thu tu diem giam dan: ");
		for (int i = 0; i < listSV.size(); i++) {
			System.out.println("Ten: " + listSV.get(i).hoTen + ", Diem So: " + listSV.get(i).diemSo);
		}
		
		//Sap xep theo danh sach chu cai alphabet
		Collections.sort(listSV, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				return (sv1.hoTen.compareTo(sv2.hoTen));
			}
		});
		
		System.out.println("\nDanh sach sinh vien theo thu tu chu cai: ");
		for (int i = 0; i < listSV.size(); i++) {
			System.out.println("Ten: " + listSV.get(i).hoTen + ", Diem So: " + listSV.get(i).diemSo);
		}
	}
	
}
