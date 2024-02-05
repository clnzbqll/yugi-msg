package com.example.yugi.service;

import com.example.yugi.entity.Result;
import com.example.yugi.model.Email;

/**
 * 邮件发送服务接口
 *
 * @author gu
 * @since 2024-02-04 05:45:31
 */
public interface IEmailService {
    /**
     * 发送邮件
     *
     * @param email 邮件
     */
    Result<?> send(Email email);
}
