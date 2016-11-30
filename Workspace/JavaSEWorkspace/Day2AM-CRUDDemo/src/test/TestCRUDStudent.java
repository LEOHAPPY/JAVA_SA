package test;

import java.sql.SQLException;
import java.util.ArrayList;

import crud.StudentCRUD;
import model.Student;

public class TestCRUDStudent {

	public static void main(String[] args) throws SQLException {
		StudentCRUD scrud = new StudentCRUD();
		ArrayList<Student> slist = scrud.getAllStudents();
		for (Student student : slist) {
			System.out.println(student.toString());
		}

	}

}
