package com.example.yugi.model;

import com.example.yugi.enums.SystemEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 邮件
 *
 * @author gu
 * @since 2024-02-05 07:26:42
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Email {
    /**
     * 消息来源系统
     */
    private SystemEnum sys;

    /**
     * 主题
     */
    private String subject;

    /**
     * 内容
     */
    private String text;

    /**
     * 收件方
     */
    private List<String> receiver;

    /**
     * 获取收件方
     *
     * @return 收件方
     */
    public String[] getReceiver(){
        return this.receiver.toArray(new String[this.receiver.size()]);
    }
}
