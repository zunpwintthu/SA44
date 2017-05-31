package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Student;

public class TestJDBCStudent {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		// Step 1 - Driver Class

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Library reference is missing for the Driver");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sa44", "root", "password");
		Statement statement = connection.createStatement();
		String query = "SELECT * FROM sa44.student where fee=1200;";
		ResultSet rs = statement.executeQuery(query);
		while (rs.next()) {
			Student studentSA44 = new Student();
			studentSA44.setId(rs.getInt("id"));
			studentSA44.setName(rs.getString("name"));
			studentSA44.setNickName(rs.getString("nick_name"));
			studentSA44.setFee(rs.getDouble("fee"));
			System.out.println(studentSA44.toString());
		}
       
	}

}
