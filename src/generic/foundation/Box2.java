package generic.foundation;

public class Box2<V> extends KeyValuePair<String, V> {
	
	public Box2(String key, V value) {
		
		super(key, value);
	}
	
	public static void main(String[] args) {
		Box2 box = new Box2<String>("ID", "T01");
		System.out.println(box.getKey() + " : " + box.getValue());
	}
	
}
