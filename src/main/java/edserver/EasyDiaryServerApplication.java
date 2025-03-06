package edserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EasyDiaryServerApplication implements CommandLineRunner {

    @Value("${spring.datasource.url}")
    private String dbUrl;

    @Value("${spring.datasource.username}")
    private String dbUser;

    @Value("${spring.datasource.password}")
    private String dbPassword;

    public static void main(String[] args) {
        SpringApplication.run(EasyDiaryServerApplication.class, args);
        System.out.println("✅ EasyDiary WebSocket 服务器已启动，端口: 8080");
    }

    @Override
    public void run(String... args) {
        System.out.println("🔥 数据库连接信息:");
        System.out.println("URL: " + dbUrl);
        System.out.println("User: " + dbUser);
        System.out.println("Password: " + dbPassword);
    }
}

