package com.example.yugi.config;

import com.example.yugi.client.MsgSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 信息发送配置类
 *
 * @author gu
 * @since 2024-02-05 07:27:59
 */
@Configuration
public class MsgSenderConfiguration {
    @Bean
    public MsgSender MsgSender() {
        return new MsgSender();
    }
}