package com.greenfox.configuration;

import com.greenfox.service.EmailService;
import com.greenfox.service.MessageProceeder;
import com.greenfox.service.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Adam on 2017. 05. 04..
 */
@Configuration
public class MessageConfiguration {
  @Bean
  public MessageProceeder messageProceeder() {
    return new MessageProceeder();
  }

  @Bean
  public MessageService messageService() {
    return new EmailService();
  }

}
