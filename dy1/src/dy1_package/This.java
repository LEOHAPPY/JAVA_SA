package dy1_package;

public class This {

	private int a = 1;
	private int b = 2;

	public This (int x) {
		this.a = x;
	}

	public This() {
		this(8);
	}

	public static void main(String[] args) {
		This t = new This();	
		System.out.println(t.a + t.b);
	}

}
