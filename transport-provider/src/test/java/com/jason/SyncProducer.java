package com.jason;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;


/**
 * @ClassName SyncProducer
 * @Description TODO
 * @Author GCJ
 * @Date 2019/6/27 16:59
 */
public class SyncProducer {

    public static void main(String[] args) throws Exception {
        //Instantiate with a producer group name.
        DefaultMQProducer producer = new
                DefaultMQProducer("TEST_PRODUCER_GROUP");
        // Specify name server addresses.
        producer.setNamesrvAddr("192.168.88.129:9876");
        //Launch the instance.
        producer.start();
        for (int i = 0; i < 1; i++) {
            //Create a message instance, specifying topic, tag and message body.
            Message msg = new Message("CONSUMER-CONTACT-TOPIC" ,
                    null ,
                    ("Hello RocketMQ ").getBytes(RemotingHelper.DEFAULT_CHARSET)
            );
            //Call send message to deliver message to one of brokers.
            SendResult sendResult = producer.send(msg);
            System.out.printf("%s%n", sendResult);
            System.out.printf("send Message is sueccess");
        }
        //Shut down once the producer instance is not longer in use.
        producer.shutdown();
    }
}
