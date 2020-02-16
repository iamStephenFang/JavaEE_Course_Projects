package cn.edu.zjut.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import cn.edu.zjut.event.EmailEvent;

public class EmailNotifier implements ApplicationListener {

    public void onApplicationEvent(ApplicationEvent evt) {
        if (evt instanceof EmailEvent) {
            EmailEvent emailEvent = (EmailEvent) evt;
            System.out.println("需要发送邮件的接收地址 " + emailEvent.getAddress());
            System.out.println("需要发送邮件的邮件正文 " + emailEvent.getText());

        } else {
            System.out.println("容器本身的事件 " + evt);
        }

    }
}