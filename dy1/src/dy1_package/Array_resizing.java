
package dy1_package;

import java.util.Arrays;

public class Array_resizing {

	public Array_resizing() {
		// TODO Auto-generated constructor stub
	}
		
	public static void main(String[] args) {
		String [] names = {"leo","may","sun"};
		
		names = Arrays.copyOf (names, 10);
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
	

}
