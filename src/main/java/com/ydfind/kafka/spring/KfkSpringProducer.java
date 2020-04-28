package com.ydfind.kafka.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.kafka.core.KafkaTemplate;

public class KfkSpringProducer {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-kafka.xml");
        // KafkaTemplate是spring用来发送消息的模板类
        KafkaTemplate<String, String> kafkaTemplate = (KafkaTemplate) context.getBean("kafkaTemplate");
        kafkaTemplate.send("kafka-topic", "Demo12345");
        System.out.println("have send msg = 我的测试消息1");
        kafkaTemplate.send("kafka-topic", "我的测试消息2");
        System.out.println("have send msg = 我的测试消息2");
        kafkaTemplate.send("kafka-topic", "我的测试消息3");
        System.out.println("have send msg = 我的测试消息3");
    }
}