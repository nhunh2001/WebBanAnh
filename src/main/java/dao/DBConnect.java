
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author MyPC
 *
 */
public class DBConnect {
	public Connection cn;
	public void KetNoi() {
	    try {
	        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	        cn = DriverManager.getConnection(
	        	    "jdbc:sqlserver://localhost:1433;databaseName=WebBanAnh;encrypt=true;trustServerCertificate=true",
	        	    "kuroyami", 
	        	    "yeunhungsensei2001"
	        	);
	        System.out.println("✅ Kết nối DB thành công");
	    } catch (Exception e) {
	        System.out.println("❌ Lỗi kết nối DB: " + e.getMessage());
	        e.printStackTrace(); // In cho biết chết ở đâu
	    }
	}
	public static void main(String[] args) throws Exception {
		DBConnect  c = new DBConnect();
		c.KetNoi();
		System.out.println("ok");
	}

}
