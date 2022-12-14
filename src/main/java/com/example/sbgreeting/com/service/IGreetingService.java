package com.example.sbgreeting.com.service;

import com.example.sbgreeting.com.dto.UserDto;
import com.example.sbgreeting.com.model.Greeting;

public interface IGreetingService {
    Greeting greetingMessage();
    String greetingMessageByName(UserDto userDto);
}