package com.example.yugi.service.impl;

import com.example.yugi.entity.Result;
import com.example.yugi.model.Email;
import com.example.yugi.service.IEmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 邮件发送服务实现类
 *
 * @author gu
 * @since 2024-02-04 05:45:31
 */
@Service
@Slf4j
public class EmailServiceImpl implements IEmailService {
    @Resource
    private JavaMailSender mailSender;
    @Value("${spring.mail.username}")
    private String from;

    /**
     * 发送邮件
     *
     * @param email 邮件
     */
    @Override
    public Result<?> send(Email email) {
        try {
            SimpleMailMessage mainMessage = new SimpleMailMessage();
            mainMessage.setFrom(from);
            mainMessage.setTo(email.getReceiver());
            mainMessage.setSubject(email.getSubject());
            mainMessage.setText(email.getText());
            mailSender.send(mainMessage);
            return Result.success();
        } catch (Exception e) {
            log.error("send email went wrong", e);
            return Result.error(e.getMessage());
        }
    }
}
