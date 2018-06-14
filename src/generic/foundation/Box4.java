package generic.foundation;

public class Box4<K, V, T> extends KeyValuePair<K, V> {
	
	private T t;
	
	
	public Box4(K key, V value) {
		
		super(key, value);
	}
	
	
	public T getT() {
		
		return t;
	}
	
	
	public void setT(T t) {
		
		this.t = t;
	}
	
	
	public static void main(String[] args) {
		Box4<String, String, Integer> box = new Box4<String, String, Integer>("Student", "David");
		box.setT(12);
		System.out.println(box.getKey() + " " + box.getValue() + " has ID: "+box.getT());
	}
	
}
