package generic.foundation;

public class Box1 extends KeyValuePair<String, Integer> {
	
	public Box1(String key, Integer value) {
		
		super(key, value);
		
	}
	
	public static void main(String[] args) {
		Box1 box1 = new Box1("Code", 01);
		System.out.println(box1.getKey() + " : " + box1.getValue());
	}
	
}
