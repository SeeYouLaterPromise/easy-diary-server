package edserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EasyDiaryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyDiaryServerApplication.class, args);
        System.out.println("✅ EasyDiary WebSocket 服务器已启动，端口: 8080");
    }

}
