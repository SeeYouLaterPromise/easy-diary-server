package edserver.model;


import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class ChatMessage {
    private String sender;
    private String receiver; // 为 null 表示群聊
    private String message;
    private String timestamp;

    public ChatMessage() {}

    public ChatMessage(String sender, String receiver, String message, String timestamp) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        this.timestamp = timestamp;
    }

    public ChatMessage(String user, String payload, String s) {
        this.sender = user;
        this.message = payload;
        this.timestamp = s;
    }


    // JSON 解析
    public static ChatMessage fromJson(String json) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, ChatMessage.class);
    }

    public String toJson() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(this);
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

}

