
public class ArrayObj {
	
	public void arrDemo1() {
		
		int[] arr;
		arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		System.out.println("Element 5 at index 4 is :" + arr[4]);
		System.out.println("--- done \n");
	}
	
	public void arrDemo2() {
		int[] arr = {11, 22, 33, 44, 55};
		System.out.println("Element 3 at index 2 is :" + arr[2]);
		System.out.println("Size of arr: " + arr.length);
		System.out.println("--- done \n");
	}
	
	public void multiDimArrDemo1() {
		String[][] names = {{"Mr.", "Ms.","Mrs."},{"Jolie", "David","Elsa"}};
		System.out.println(names[0][0] + names[1][1]); //Mr.David
		System.out.println(names[0][2] + names[1][0]); //Mrs.Jolie
		System.out.println(names[0][1] + names[1][2]); //Ms.Elsa
				
		System.out.println("\nSize of names: " + names.length); //2
		System.out.println("--- done \n");
	}
	
	public void copyArray() {
		char[] copyFrom = {'t','h','s','i','i','s','f','l','o','w','e','r'};
		char[] copyTo = new char[10];
		System.arraycopy(copyFrom, 6, copyTo, 0, 6);
		System.out.println(new String(copyTo));
		System.out.println("--- done \n");
	}
	
	public static void main(String[] args) {
		ArrayObj arr = new ArrayObj();
		arr.arrDemo1();
		arr.arrDemo2();
		arr.multiDimArrDemo1();
		arr.copyArray();
	}
	
}
