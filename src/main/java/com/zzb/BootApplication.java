package com.zzb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 程序入口
 * @param
 * @return
 * @author zengzhibin
 * @date 2020-5-28 11:06
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableScheduling
@EnableAsync
public class BootApplication {

    private final static Logger logger = LoggerFactory.getLogger(BootApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
        logger.info("===============工程启动成功！================");
    }

}
