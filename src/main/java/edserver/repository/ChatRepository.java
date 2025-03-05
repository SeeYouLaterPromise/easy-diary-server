package edserver.repository;

import edserver.model.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatRepository extends JpaRepository<ChatMessage, Long> {
    // 根据房间 ID 获取所有聊天记录
    List<ChatMessage> findByRoomId(String roomId);

    // 根据用户 ID 获取用户发送的所有消息
    List<ChatMessage> findBySenderId(String senderId);
}
