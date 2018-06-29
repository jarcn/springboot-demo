package com.joyveb.springboot.kafka;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author: chenjia
 * @date: 2018/6/28 21:57
 * @decription:
 * @modified By:
 */

@Slf4j
@Component
public class MyKafkaConsumer {

    //监听多个topic,用逗号隔开
    @KafkaListener(topics = {"test"})
    public void listen(ConsumerRecord<?, ?> record) {

        Optional<?> kafkaMessage = Optional.ofNullable(record.value());

        if (kafkaMessage.isPresent()) {

            Object message = kafkaMessage.get();
            System.out.println("消费者监听---->" + record);
            System.out.println("消费消息---->" + message);

        }

    }
}
