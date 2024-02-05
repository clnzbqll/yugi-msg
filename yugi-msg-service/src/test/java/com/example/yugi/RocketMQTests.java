package com.example.yugi;

import com.example.yugi.consts.TopicConst;
import com.example.yugi.model.Email;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


/**
 * RocketMQ测试类
 *
 * @author gu
 * @since 2024-02-05 07:23:58
 */
@SpringBootTest
@Slf4j
public class RocketMQTests {
    @Resource
    private RocketMQTemplate rocketMQTemplate;

    /**
     * 发送邮件
     */
    @Test
    public void sendEmail() {
        Email email = new Email();
        List<String> list = new ArrayList<>();
        list.add("2379522113@qq.com");
        email.setReceiver(list);
        email.setSubject("sub");
        email.setText("1111");
        rocketMQTemplate.convertAndSend(TopicConst.EMAIL, email);
    }
}
