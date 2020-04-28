package com.ydfind.kafka.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.kafka.core.KafkaTemplate;

public class KfkSpringProducer {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-kafka.xml");
        // KafkaTemplate��spring����������Ϣ��ģ����
        KafkaTemplate<String, String> kafkaTemplate = (KafkaTemplate) context.getBean("kafkaTemplate");
        kafkaTemplate.send("kafka-topic", "Demo12345");
        System.out.println("have send msg = �ҵĲ�����Ϣ1");
        kafkaTemplate.send("kafka-topic", "�ҵĲ�����Ϣ2");
        System.out.println("have send msg = �ҵĲ�����Ϣ2");
        kafkaTemplate.send("kafka-topic", "�ҵĲ�����Ϣ3");
        System.out.println("have send msg = �ҵĲ�����Ϣ3");
    }
}