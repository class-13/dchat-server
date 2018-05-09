package ru.ssau.dchat.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Вячеслав on 01.05.2018.
 */
@Data
@NoArgsConstructor
public class Message {
    private String content;
    private String sender;
    private MessageType type;

    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }

    public Message(String content, String sender, MessageType type) {
        this.content = content;
        this.sender = sender;
        this.type = type;
    }
}
