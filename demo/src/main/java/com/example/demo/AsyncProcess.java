package com.example.demo;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncProcess {

    private static final Logger log = LoggerFactory.getLogger(AsyncProcess.class);

    @Async
    public void doProcess(String tenant) {
        log.info("start process for {}.", tenant);
        // if("tenant2".equals(tenant)){
        // throw new RuntimeException("test exception.");
        // }
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        log.info("end process for {}.", tenant);
    }
}
