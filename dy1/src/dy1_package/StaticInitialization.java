package dy1_package;

import java.util.Iterator;

public class StaticInitialization {

	private static int[] values = new int[10];
	
	static {
		for (int i = 0; i < values.length; i++) {
			values[i] = (int) (100.0 * Math.random());
		}
	}
	
	public StaticInitialization() {
		// TODO Auto-generated constructor stub
	}
	
	public static void callStatic(){
		StaticInitialization s = new StaticInitialization();
		for (int i = 0; i < s.values.length; i++) {
			System.out.println(s.values[i] );
		}
		System.out.println("\n");
			
	}
	
	public void callStatic2(){
		StaticInitialization s = new StaticInitialization();
		for (int i = 0; i < s.values.length; i++) {
			System.out.println(s.values[i]);
		}
		System.out.println("\n");			
	}

	public static void main(String[] args) {
		StaticInitialization s = new StaticInitialization();
		for (int i = 0; i < s.values.length; i++) {
			System.out.println(s.values[i]);
		}
		System.out.println("\n");
		
		callStatic();
		s.callStatic2();
	}

}
