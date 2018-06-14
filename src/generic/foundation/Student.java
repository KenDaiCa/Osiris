package generic.foundation;


public class Student<T> extends People<Teacher>{
	
	public static void main(String[] args) {
		Student st = new Student<>();
		Teacher  tc = new Teacher();
		tc.setName("David");
		st.insert(tc.getName());

		
	}
	
}
