package arraylist.foundation;

import java.util.HashMap;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		//Khoi tao MAP
		HashMap listHS = new HashMap();
		listHS.put("hs01", "Hoc Sinh A");
		listHS.put("hs02", "Hoc Sinh B");
		listHS.put("hs03", "Hoc Sinh C");
		listHS.put(new Integer(20), "Hoc Sinh D");
		
		System.out.println(listHS.get("hs01"));
		System.out.println(listHS.get("hs02"));
		System.out.println(listHS.get("hs03"));
		System.out.println(listHS.get(20));
		
		//Them gia tri vao hashmap listSV
		HashMap<Integer, String > listSV = new HashMap<>();
		listSV.put(01, "Sinh Vien A");
		listSV.put(02, "Sinh vien B");
		listSV.put(03, "Sinh vien C");
		
		System.out.println("\n=== Get gia tri cua tung phan tu trong hashmap");
		System.out.println(listSV.get(01));
		System.out.println(listSV.get(02));
		System.out.println(listSV.get(03));
		
		System.out.println("\n=== Print all element listSV using foreach");
		for (Integer i : listSV.keySet()) {
			System.out.println(i + ": " + listSV.get(i));
		}
		
		//Xem kich thuoc hashmap
		System.out.println("\nSize of listSV: ");
		System.out.println(listSV.size());
		
		//Remove one of key-value in hashmap
		System.out.println("\nRemove Sinh Vien B");
		listSV.remove(02);
		System.out.println(listSV.get(02));
		
		//Clear all key-value of hashmap
		System.out.println("\nXoa tat ca phan tu trong hashmap listSV");
		listSV.clear();
		System.out.println(listSV.get(03));
		
		//
		
	}
	
}
