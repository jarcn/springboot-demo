package com.joyveb.springboot.ctrl;

import com.joyveb.springboot.kafka.MyKafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: chenjia
 * @date: 2018/6/29 10:06
 * @decription:
 * @modified By:
 */
@RestController
public class KafkaController {

    @Autowired
    private MyKafkaProducer producer;

    private boolean stop = false;

    //模拟kafka producer send msg to kafka
    @RequestMapping(value = "/kafka", method = RequestMethod.GET)
    public void productData() {
        int count = 10;
        while (!stop && count > 0) {
            producer.send();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count--;
        }
        System.out.println("Kafka producer exit ...");
    }

}
