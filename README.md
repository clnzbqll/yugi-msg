1. 引入依赖：

```
<dependency>
    <groupId>com.example</groupId>
    <artifactId>yugi-msg-starter</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```

2.添加配置

```
rocketmq:
    name-server: 127.0.0.1:9876
    producer:
        group: yugi-${system-code}-msg-group
        send-message-timeout: 300000
```

3.使用示例

```
    @Resource
    MsgSender msgSender;

    @Test
    public void testSendEmail(){
        List<String> list = new ArrayList<>();
        list.add("2379522113@qq.com");
        Email email = Email.builder()
                .receiver(list)
                .subject("主题")
                .text("内容")
                .build();
        msgSender.sendEmail(email);
    }
```

