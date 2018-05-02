package ru.ssau.dchat.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Вячеслав on 01.05.2018.
 */
@Data
@NoArgsConstructor
public class Message {
    private String message;
    private String sender;

    public Message(String message, String sender) {
        this.message = message;
        this.sender = sender;
    }
}
