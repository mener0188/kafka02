package com.ydfind.kafka.spring;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;
public class KfkConsumerListener implements MessageListener<String, String> {
    /**
     * �������Զ�ִ�и÷���
     * ������Ϣ
     * �Զ��ύoffset
     *
     * @param record
     */
    public void onMessage(ConsumerRecord<String, String> record) {
        System.out.printf("partition = %d, offset = %d, key = %s, value = %s%n", record.partition(), record.offset(), record.key(), record.value());
    }
}
