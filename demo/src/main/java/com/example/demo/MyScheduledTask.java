package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

public class MyScheduledTask {
    
    private static final Logger log = LoggerFactory.getLogger(MyScheduledTask.class);

    @Autowired
    private AsyncProcess asyncProcess;

    private String tenant;

    public MyScheduledTask(String tenant) {
        this.tenant = tenant;
        log.info("constructorです;{}.", tenant);
    }

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        log.info("The time is now {}", format.format(new Date()));
        for(int i = 0; i < 3; i++) {
            asyncProcess.doProcess(tenant+i);
        }

    }
    
}
