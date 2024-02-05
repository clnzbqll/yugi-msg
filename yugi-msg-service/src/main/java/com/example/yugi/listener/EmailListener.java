package com.example.yugi.listener;

import com.example.yugi.consts.ConsumerGroupConst;
import com.example.yugi.consts.TopicConst;
import com.example.yugi.model.Email;
import com.example.yugi.service.IEmailService;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * RocketMQ监听器
 *
 * @author gu
 * @since 2024-02-05 07:29:20
 */
@RocketMQMessageListener(
        consumerGroup = ConsumerGroupConst.EMAIL,
        topic = TopicConst.EMAIL
)
@Component
@Slf4j
public class EmailListener implements RocketMQListener<Email> {
    @Resource
    private IEmailService emailService;

    @Override
    public void onMessage(Email email) {
        log.info("receive sending email request from {}...", email.getSys());
        emailService.send(email);
    }
}