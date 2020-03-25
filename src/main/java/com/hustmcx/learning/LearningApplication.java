package com.hustmcx.learning;

import com.hustmcx.learning.netty_disruptor.client.NettyClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.security.krb5.internal.NetClient;


//@SpringBootApplication
public class LearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningApplication.class, args);
        //建立连接并发送消息
//        new NettyClient().sendData();
    }

}
