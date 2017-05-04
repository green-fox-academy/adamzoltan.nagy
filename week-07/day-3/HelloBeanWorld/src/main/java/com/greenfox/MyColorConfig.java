package com.greenfox;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Adam on 2017. 05. 04..
 */
@Configuration
public class MyColorConfig {
  @Bean
  public MyColor myColor() {
    return new BlueColor();
    }
  }
