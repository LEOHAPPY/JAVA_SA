package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Student;

public class StudentJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		// 1. Driver
        // REFLECTION API
		Class.forName("com.mysql.jdbc.Driver");
		// 2. Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
		// 3. Statement
		Statement st = connection.createStatement();
		// 4. Execute the query
		ResultSet rs = st.executeQuery("SELECT * FROM test.student;");
		// 5. Process
		while (rs.next()) {
           Student s = new Student();
           s.setMatricNumber(rs.getString("matric"));
           s.setName(rs.getString("name"));
           System.out.println(s.toString());
		}
		// 6. Close
		st.close();
		connection.close();

	}

}
