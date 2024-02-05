package com.example.yugi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Yugi MSG启动类
 *
 * @author gu
 * @since 2024-02-05 07:21:17
 */
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class YugiMsgServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(YugiMsgServiceApplication.class, args);
        log.info("阿姨，一份儿童套餐！");
    }
}