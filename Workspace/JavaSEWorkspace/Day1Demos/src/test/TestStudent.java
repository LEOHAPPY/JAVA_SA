package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.NameComparator;
import model.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student s1 = new Student("LIN SIYIN", "SA43-01", null, "pleasant lady", 40.0);
     Student s2 = new Student("MATHEW", "SA43-02", null, "MISSING IN ACTION", 80.0);
     Student s3 = new Student("IMRAN", "SA43-03", null, "HIDING HIS FACE IN HIS BEARD", 60.0);
     Student s4 = new Student("MANISHA", "SA43-04", null, "QUIET LADY", 10.0);
     ArrayList<Student> slist = new ArrayList<Student>();
     slist.add(s1);slist.add(s2);slist.add(s3);slist.add(s4);
     System.out.println("BEFORE SORT");
     for (Student student : slist) {
		System.out.println(student.toString());
	 }
     Collections.sort(slist);
     System.out.println("AFTER SORT BASED ON FEE");
     for (Student student : slist) {
 		System.out.println(student.toString());
 	 }
     Collections.sort(slist, new NameComparator());
     System.out.println("AFTER SORT BASED ON NAME");
     for (Student student : slist) {
 		System.out.println(student.toString());
 	 }
     if (s1.equals(s2)) {
    	 System.out.println("SAME PERSON");
     } else {
    	 System.out.println("IDIOT! DIFFERENT PERSON");
     }

	}

}
