package edserver.demo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDBConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/easy_diary?serverTimezone=Asia/Shanghai&useSSL=false&allowPublicKeyRetrieval=true";
        String user = "root";
        String password = "lu618618";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ 数据库连接成功！");
            conn.close();
        } catch (SQLException e) {
            System.out.println("❌ 数据库连接失败: " + e.getMessage());
        }
    }
}
