public class StringMethod {
	
	public void charAtString() {
		
		String strName = "Ken Huynh";
		char strChar = strName.charAt(4);
		System.out.println("Char at position 4 of string \"" + strName + "\"  is: " + strChar);
		System.out.println("---- Done ----\n");
	}
	
	
	public void concatString() {
		
		String strA = "This is ";
		String strB = strA.concat("FLOWERS");
		System.out.println("\nOld string is: " + strA);
		System.out.println("New string after concatenate: " + strB);
		
		System.out.println("---- Done ----\n");
		
	}
	
	
	public void compareToValue() {
		
		String strA = "ABC"; // C = 67
		String strB = "ABCDE"; // E = 69
		Integer intA = 123;
		Integer intB = 12;
		
		System.out.println("String need to be compared: " + strB);
		System.out.println("Orginal string: " + strA);
		System.out.println("Compare strB - strA: " + strB.compareTo(strA) + "\n");
		
		System.out.println("Number need to be compared : " + intB);
		System.out.println("Orginal number: " + intA);
		System.out.println("Compare intB - intA: " + intB.compareTo(intA));
		System.out.println("---- Done ----\n");
	}
	
	
	public void copyValueOfValue() {
		
		char[] strA = {'t', 'h', 'i', 's', 'i', 's', 'f', 'l', 'o', 'w', 'e', 'r', 's'};
		String strB = "";
		
		System.out.println("Value of strB is: " + strB + "null");
		System.out.println("Copy value of strA into strB: " + String.copyValueOf(strA)); // strB = strA
		
		strB = String.copyValueOf(strA, 4, 9);
		System.out.println("Copy a part of strA into strB: " + strB);
		
		int a = strA.length;
		System.out.println("Length of strA: " + a);
		System.out.println("---- Done ----\n");
	}
	
	
	public void endsWithSuffix() {
		
		String str1 = "Hello Ken";
		boolean str2 = str1.endsWith("Kenx");
		System.out.println("Is string matched to \"Kenx\"? : " + str2); // false
		System.out.println("---- Done ----\n");
	}
	
	
	public void startWithPrefix() {
		
		String str1 = "Hello Ken";
		boolean str2 = str1.startsWith("Hello");
		System.out.println("Is string matched to \"Hello\" : " + str2);
		System.out.println("---- Done ----\n");
	}
	
	
	public void replaceString() {
		
		String strA = "This is flowers";
		String strB = strA.replace("flower", "plant");
		System.out.println("This is strA: " + strA);
		System.out.println("Replace flower by plant in strA: " + strB);
		System.out.println("---- Done ----\n");
	}
	
	
	public void subStringValue() {
		
		String strA = "This is flowers";
		String strB = strA.substring(4);
		String strC = strA.substring(4, 15);
		System.out.println("String strA is: " + strA);
		System.out.println("Substring strA at index = 4: " + strB);
		System.out.println("Substring strA with begin = 8 and end = 15: " + strC);
		System.out.println("---- Done ----\n");
	}
	
	
	public void trimString() {
		
		String strA = "   This is flowers  ";
		String strB = strA.trim();
		System.out.println("Orginal strA: " + strA);
		System.out.println("Delete space of strA: " + strB);
		System.out.println("---- Done ----\n");
	}
	
	
	public void valueOfValue() {
		
		boolean strA = false;
		String strB = String.valueOf(strA);
		System.out.println("String strA is: " + strB);
		System.out.println("---- Done ----\n");
	}
	
	
	public void containsValue() {
		
		String strA = "This is flowers";
		boolean strB = strA.contains("flowers");
		System.out.println("Is strA contains word \"flower\" : " + strB);
		System.out.println("---- Done ----\n");
	}
	
	
	public void contentEqualsValue() {
		
		String strA = "This is flower";
		boolean strB = strA.contentEquals("This is flower");
		boolean strC = strA.contentEquals("flower");
		System.out.println("This is strA: " + strA);
		System.out.println("Is strA matched \"This is flower\": " + strB);
		System.out.println("Is strA matched \"flower\": " + strC);
		System.out.println("---- Done ----\n");
	}
	
	
	public void equalsValue() {
		
		String strA = "This is flowers";
		int n = 10;
		boolean strB = strA.equals("This is flowers");
		boolean strC = strA.equals("this is Flowers");
		boolean strE = strA.equals(n);
		System.out.println("Compare 1: " + strB);
		System.out.println("Compare 2: " + strC);
		System.out.println("Compare 3: " + strE);
		System.out.println("---- Done ----\n");
	}
	
	
	public void getCharsValue() {
		
		String strA = "abcdef";
		char[] ch1 = new char[20];
		char[] ch2 = new char [20];
		strA.getChars(0, 2, ch1, 0);
		System.out.println(ch1);
		strA.getChars(1, strA.length(), ch2, 2);
		System.out.println(ch2);
		System.out.println("---- Done ----\n");
	}
	
	public void hashCodeValue() {
		String strA = "This is flowers";
		System.out.println("Hash code of strA: " + strA.hashCode());
		System.out.println("---- Done ----\n");
	}
	
	public void isEmptyValue() {
		String strA = "This is flowers";
		boolean a = strA.isEmpty();
		String strB = "";
		boolean b = strB.isEmpty();
		System.out.println("strA is: " + strA);
		System.out.println("Is strA empty: " +a);
		System.out.println("strB is: " + strB);
		System.out.println("Is strB empty: " +b);
		System.out.println("---- Done ----\n");
	}
	
	public static void main(String[] args) {
		
		StringMethod st = new StringMethod();
		st.concatString();
		st.charAtString();
		st.compareToValue();
		st.copyValueOfValue();
		st.endsWithSuffix();
		st.startWithPrefix();
		st.replaceString();
		st.subStringValue();
		st.trimString();
		st.valueOfValue();
		st.containsValue();
		st.contentEqualsValue();
		st.equalsValue();
		st.getCharsValue();
		st.hashCodeValue();
		st.isEmptyValue();
	}
	
}
