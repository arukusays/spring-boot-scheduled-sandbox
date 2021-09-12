package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:/config/scheduletask.xml")
//@EnableScheduling
//@EnableAsync
public class MyScheduledTaskConfig {
    
}
