package condition.foundation;

public class IfBasic {
	
	public void Demo01() {
		
		int age = 19;
		if (age > 18) {
			System.out.println("Demo 1 - Above: " + age);
			System.out.println("----------");
		}
	}
	
	public void Demo02() {
		int age = 15;
		if (age > 18) {
			System.out.println("Demo 2 - Above: 18");
			System.out.println("----------");
		}else {
			System.out.println("Demo 2 - Below: 18");
			System.out.println("----------");
		}
	}
	
	public void Demo3() {
		int age = 17;
		if (age > 17) {
			System.out.println("Demo 3 - Above: 17");
			System.out.println("----------");
		}else if (age < 17) {
			System.out.println("Demo 3 - Below: 17");
			System.out.println("----------");
		}else {
			System.out.println("Demo 3 - Equal: 17");
			System.out.println("----------");
		}
		
	}
	
	public void Demo4() {
		boolean isResults;
		int a = 11;
		int b = 5;
		if (a % b == 0) {
			isResults = true;
			System.out.println("Demo 4-1: " + isResults); //true
		}else {
			isResults = false;
			System.out.println("Demo 4-1: " + isResults); //false
		}
		
		System.out.println("----------");
		//second way
		isResults = (a % b == 0) ? true : false;
		System.out.println("Demo 4-2: " + isResults); //false
		isResults = (a % b != 0) ? true : false;
		System.out.println("Demo 4-2: " + isResults); //true
	}
	
	public static void main(String[] args) {
		
		IfBasic bs = new IfBasic();
		bs.Demo01();
		bs.Demo02();
		bs.Demo3();
		bs.Demo4();
	}
	
}
