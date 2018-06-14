package BasicClass;

import java.util.ArrayList;

public class Process {
	
	public ArrayList<Integer> chiaHet(int x){
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				list.add(i);
			}
		}
		return (list.size() != 0) ? list:null;
	}
	
	
	public static void main(String[] args) {
		
		
	}
	
}
