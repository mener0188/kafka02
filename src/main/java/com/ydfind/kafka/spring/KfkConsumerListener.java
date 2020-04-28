package com.ydfind.kafka.spring;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;
public class KfkConsumerListener implements MessageListener<String, String> {
    /**
     * 监听器自动执行该方法
     * 消费消息
     * 自动提交offset
     *
     * @param record
     */
    public void onMessage(ConsumerRecord<String, String> record) {
        System.out.printf("partition = %d, offset = %d, key = %s, value = %s%n", record.partition(), record.offset(), record.key(), record.value());
    }
}
