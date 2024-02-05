package com.example.yugi;

import com.example.yugi.entity.Result;
import com.example.yugi.service.IEmailService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import javax.annotation.Resource;

/**
 * 邮件测试类
 *
 * @author gu
 * @since 2024-02-05 07:22:43
 */
@SpringBootTest
@Slf4j
class EmailTests {
    @Resource
    private IEmailService emailService;

    /**
     * 发送邮件
     */
    @Test
    void sendEmail() {
        Result result =  emailService.send(null);
        System.out.println(result.getCode());
    }
}