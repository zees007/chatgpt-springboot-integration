package com.openai.chatgtp.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author mhmdz
 * Created By Zeeshan on 12-11-2023
 * @project chatgtp
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatBotRequest {

    private String model;
    private List<Message> messages;
    private int n;
    private double temperature;
    private int max_tokens;
}
