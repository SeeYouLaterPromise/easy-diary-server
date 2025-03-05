package edserver.service;

import edserver.repository.ChatRepository;
import edserver.model.ChatMessage;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service  // ✅ 确保 Spring 托管该类
public class ChatService {

    @Autowired
    private ChatRepository chatRepository;

    public ChatMessage saveMessage(ChatMessage message) {
        return chatRepository.save(message);
    }

    public List<ChatMessage> getAllMessages() {
        return chatRepository.findAll();
    }
}
