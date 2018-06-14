package generic.foundation;

public class People<T> implements GenericKV<T> {
	
	@Override
	public void insert(T obj) {
		System.out.println(obj);
	}
	
	
	@Override
	public void update(T obj) {
		System.out.println(obj);
	}
	
	
	public static void main(String[] args) {
		
	}
	
}
