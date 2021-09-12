package com.example.demo;

import java.util.Set;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.ScheduledTask;
import org.springframework.scheduling.config.ScheduledTaskHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    private static final Logger log = LoggerFactory.getLogger(ScheduleController.class);

    @Autowired
    private ScheduledTaskHolder schedluedTaskHolder;

    @GetMapping("/list")
    public String list() throws JsonProcessingException {
        Set<ScheduledTask> tasks = schedluedTaskHolder.getScheduledTasks();
        log.info("there are {} tasks.", tasks.size());
        if(!tasks.isEmpty()){
            log.info("task info : {}", tasks);
            return tasks.toString();
        }
        return "no scheduled task.";
    }
}
