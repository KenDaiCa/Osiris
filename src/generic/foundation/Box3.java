package generic.foundation;

public class Box3<K, V> extends KeyValuePair<K, V> {
	
	public Box3(K key, V value) {
		
		super(key, value);
		
	}
	
	public static void main(String[] args) {
		Box3 box = new Box3<Integer, String>(03, "Cake");
		System.out.println("Order: " + box.getKey() + " " + box.getValue());
		
	}
	
}
