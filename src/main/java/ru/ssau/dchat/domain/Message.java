package ru.ssau.dchat.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by Вячеслав on 01.05.2018.
 */
@Data
@NoArgsConstructor
public class Message {
    private String content;
    private String sender;
    private String time;
    private MessageType type;

    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }

    public Message(String content, String sender, MessageType type, String time) {
        this.content = content;
        this.sender = sender;
        this.type = type;
        this.time = time;
    }
}
