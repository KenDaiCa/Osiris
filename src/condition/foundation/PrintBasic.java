package condition.foundation;

public class PrintBasic {
	
	public static void main(String[] args) {
		
		// %[arg-index][flag][width][.precision]type
		System.out.printf("Integer : %d\n", 65); // In so integer
		System.out.printf("Integer : %7d\n", 12345); // In khoang trang ben trai
		System.out.printf("Integer : %-7d\n", 12345); // In khoang trang ben phai
		System.out.printf("Integer : %07d\n", 12345); // Them so 0 ben phai
		System.out.println("\n---------------");

		System.out.printf("%-8s%-8s%s\n", "N0.1", "N0.2", "N0.3");
		System.out.printf("%-8d%-8d%03d\n", 2, 3, 4);
		
		System.out.println("\n---------------");
		System.out.printf("String : %s\n", "Hello"); //In chuoi
		System.out.printf("String : %10s\n", "Hello"); //In khoang trang ben trai
		System.out.printf("String : %-10s\n", "Hello"); //In khoang trang ben phai
		System.out.printf("String : %s-10\n", "Hello"); //In chuoi cung voi "-10"
		System.out.printf("String : %.4s\n", "Hello"); //In toi da 4 chu cai dau tien
		
		System.out.println("\n---------------");
		System.out.printf("%-12s%-12s%s\n", "Column A", "Column B", "Column C");
		System.out.printf("%-12.3s%-12s%.4s\n", "Wellcome", "To", "VietNam");
		System.out.printf("%-12.4s%s\n", "Wellcome", "To", "VietNam");
		
		System.out.println("\n---------------");
		System.out.printf("Float : %f\n", 1111.123459); 
		System.out.printf("Float : %15f\n",1111.123459);
		System.out.printf("Float : %-15f\n",1111.123459);
		System.out.printf("Float : %.5f\n",1111.123459);
		
		System.out.println("\n---------------");
		System.out.printf("%-12s%-12s\n","Column 1","Column 2");
        System.out.printf("%-12.6f%.8f", 1.12345,123.12345);
	}
	
}
