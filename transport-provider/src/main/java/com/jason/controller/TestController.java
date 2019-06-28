package com.jason.controller;

import com.jason.pojo.TransportTaskEntity;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author GCJ
 * @Date 2019/6/28 15:51
 */
@RestController
@RequestMapping("/var")
public class TestController {

        @RequestMapping(value = "/save",method = RequestMethod.POST)
        public String getSendMessage(@RequestBody TransportTaskEntity transport) throws Exception {
                System.out.println(transport);
                DefaultMQProducer producer = new DefaultMQProducer("TEST_PRODUCER_GROUP");
                producer.setNamesrvAddr("192.168.88.129:9876");
                producer.start();
                Message message = new Message("TEST_MESSAGE_JASON_TOPIC",transport.toString().getBytes(RemotingHelper.DEFAULT_CHARSET));
                SendResult result = producer.send(message);
                System.out.printf("%s%n", result);
                producer.shutdown();
                return "send Message is Success";
        }
}
