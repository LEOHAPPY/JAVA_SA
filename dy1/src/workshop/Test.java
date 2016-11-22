package workshop;

public class Test extends ClubApplication{
	public static void main(String[] args) {
		
		Person leo = new Person("lisu","chao","");
		leo.show();
		Facility fa = new Facility("Macbook pro","13' 16GB 512GB 2.9hz");
		fa.show();
		Facility fa1 =new Facility("Macbook air");
		fa1.show();
	}
}

