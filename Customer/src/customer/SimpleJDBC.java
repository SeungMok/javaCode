package customer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SimpleJDBC {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로드 실패");
		}
		
		Connection conn = null;
		try {
			String URL = "jdbc:oracle:thin:@localhost:1521/XE";
			String ID = "hr";
			String PW = "hr";
			conn = DriverManager.getConnection(URL, ID, PW);
			
			System.out.println(conn);
			//3. sql문 작성
			String sql = "select * from employees where employee_id = 103";
			//4. Statement 객체 생성
			PreparedStatement stmt = conn.prepareStatement(sql);
			//5. 쿼리문
			ResultSet rs = stmt.executeQuery();
			//6. 결과
			
			while(rs.next()) {
				String name = rs.getString("first_name");
				String salary = rs.getString("salary");
				System.out.println(name);
				System.out.println(salary);
			}
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}