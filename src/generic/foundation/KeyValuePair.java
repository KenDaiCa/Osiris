package generic.foundation;

public class KeyValuePair<K, V> {
	
	private K	key;
	private V	value;
	
	
	/*
	 * CONTRUCTOR
	 */
	
	public KeyValuePair(K key, V value) {
		
		super();
		this.key = key;
		this.value = value;
	}
	
	
	public K getKey() {
		
		return key;
	}
	
	
	public void setKey(K key) {
		
		this.key = key;
	}
	
	
	public V getValue() {
		
		return value;
	}
	
	
	public void setValue(V value) {
		
		this.value = value;
	}
	
	
	public static void main(String[] args) {
		
		/*
		 * Tao instance KeyValuePair <String, Integer>
		 */
		KeyValuePair<String, Integer> profileEmp = new KeyValuePair<String, Integer>("David", 01);
		String _name = profileEmp.getKey();
		int _id = profileEmp.getValue();
		System.out.println("Name: " + _name + ", ID: " + _id);
		
		/*
		 * Tao instance KeyValuePair <Integer, String>
		 */
		KeyValuePair<Integer, String> order = new KeyValuePair<Integer, String>(5, "Cake");
		int _quantity = order.getKey();
		String _item = order.getValue();
		System.out.println("Quantity: " + _quantity + ", Item: " + _item);
	}
	
}
