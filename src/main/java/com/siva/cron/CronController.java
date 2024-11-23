package com.siva.cron;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CronController {
    @Scheduled(cron = "*/5 * * * * *")
    public static void every5Seconds(){

        System.out.println("this prints every 5 seconds");
    }
    @Scheduled(fixedDelay = 10000)
    public static void fixedDelay(){
        System.out.println("This print with 10 second delay");
    }

    @Scheduled(fixedRate = 15000)
    public static void fixedRate(){
        System.out.println("This print with 15 second with fixed rate");
    }
}
