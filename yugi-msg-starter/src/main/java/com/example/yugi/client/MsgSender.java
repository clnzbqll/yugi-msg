package com.example.yugi.client;


import com.example.yugi.consts.TopicConst;
import com.example.yugi.model.Email;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;

import javax.annotation.Resource;

/**
 * 消息发送器
 *
 * @author gu
 * @since 2024-02-04 08:36:33
 */
@Slf4j
public class MsgSender {
    @Resource
    private RocketMQTemplate rocketMQTemplate;

    /**
     * 发送邮件消息
     *
     * @param mail 邮件
     */
    public void sendEmail(Email mail) {
        rocketMQTemplate.syncSend(TopicConst.EMAIL, mail);
        log.info("消息发送成功");
    }
}
