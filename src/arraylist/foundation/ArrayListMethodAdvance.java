package arraylist.foundation;

import java.util.ArrayList;

public class ArrayListMethodAdvance {
	
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Test_01");
		arr.add("Test_02");
		arr.add("Test_03");
		arr.add("Test_04");
		arr.add("Test_05");
		
		System.out.println("\n**1- Size of orginal array: " + arr.size());
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		System.out.println("----------------------------");
		/*
		 * Chen phan tu tai chi so index
		 */
		System.out.println("\n2- Chen phan tu \"-> New Element\" sau Test_02: ");
		arr.add(2, "-> New Element");
		System.out.println("** Size: " + arr.size());
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		System.out.println("----------------------------");
		/*
		 * Them mot phan tu vao cuoi danh sach
		 */
		System.out.println("\n3- Them 1 element vao cuoi danh sach: ");
		arr.add("-> Last Element");
		System.out.println("** Size: " + arr.size());
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
			
		}
		
		System.out.println("----------------------------");
		/*
		 * Chen 3 phan tu cua list C vao arr
		 */
		ArrayList<String> list = new ArrayList<>();
		list.add("New_String_01");
		list.add("New_String_02");
		list.add("New_String_03");
		
		arr.addAll(list);
		System.out.println("\n4- Them 3 element cua mot array vao current array: ");
		System.out.println("** Size: " + arr.size());
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		System.out.println("----------------------------");
		/*
		 * Xoa phan tu cua mot list ra khoi arr
		 */
		System.out.println("\n5- Xoa 3 phan tu cua list C ra khoi mang arr");
		arr.removeAll(list);
		System.out.println("** Size: " + arr.size());
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		System.out.println("----------------------------");
		/*
		 * Tra ve mot ban copy cua Arraylist hien thoi
		 */
		System.out.println("\n6- Tao ban copy cua arr");
		ArrayList<String> arrCopy = new ArrayList<>();
		arrCopy = (ArrayList<String>) arr.clone();
		System.out.println("** Size: " + arrCopy.size());
		
		System.out.println("----------------------------");
		/*
		 * Chen 3 phan tu cua list vao vi tri index 3
		 */
		System.out.println("\n7- Chen 3 phan tu cua list C vao vi tri index=3: ");
		arrCopy.addAll(2, list);
		System.out.println("** Size: " + arrCopy.size());
		for (int i = 0; i < arrCopy.size(); i++) {
			System.out.println(arrCopy.get(i));
			
		}
		
		System.out.println("----------------------------");
		/*
		 * Tra ve chi so cua phan tu 
		 */
		System.out.println("\n8- Tra ve chi so cua phan tu: ");
		System.out.println("+ Index of \"Test_03\" is: " + arrCopy.indexOf("Test_03"));
		System.out.println("+ Index of \"Last Element\" is: " + arrCopy.lastIndexOf("-> Last Element"));
		
		System.out.println("----------------------------");
		/*
		 * Xoa phan tu co chi so index
		 */
		System.out.println("\n9- Xoa phan tu co chi so index: ");
		System.out.println("** Size: " + arrCopy.size());
		arrCopy.remove(3);
		System.out.println("** Size - after removing element: " + arrCopy.size());
		for (int i = 0; i < arrCopy.size(); i++) {
			System.out.println(arrCopy.get(i));
		}
		
		System.out.println("----------------------------");

		/*
		 * Convert ArrayList to Array
		 */
		System.out.println("\n10- Xuat ra tat ca phan tu co trong danh sach: ");
		String[] array = arrCopy.toArray(new String[arrCopy.size()]);
		System.out.println("** Size of array: " + array.length);
		for (int i = 0; i < array.length; i++) {
			System.out.println("array: " + array[i]);
		}		
		
		
	}
	
}
