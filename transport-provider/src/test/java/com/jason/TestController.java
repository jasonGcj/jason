package com.jason;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author GCJ
 * @Date 2019/6/28 16:10
 */
public class TestController {

    public static void main(String[] args) throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer("TEST_PRODUCER_GROUP");
        producer.setNamesrvAddr("192.168.88.129:9876");
        producer.start();
        Message message = new Message("TEST_MESSAGE_JASON_TOPIC","jason","1111".getBytes());
        SendResult result = producer.send(message);
        System.out.println(result);
        producer.shutdown();
    }
}
