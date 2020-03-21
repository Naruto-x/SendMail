package com.naruto.mail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;


@SpringBootTest
class MailApplicationTests {
    @Autowired
    private JavaMailSender mailSender;

    @Test
    void contextLoads() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("naruto.x@foxmail.com");
        message.setTo("575326414@qq.com");
        message.setSubject("这是标题");
        message.setText("这是内容");
        mailSender.send(message);
    }

}
