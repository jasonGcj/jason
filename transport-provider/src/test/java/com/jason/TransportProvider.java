package com.jason;

import com.jason.controller.TransportController;
import com.jason.service.TransportService;
import com.sun.webkit.plugin.Plugin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName TransportProvider
 * @Description TODO
 * @Author GCJ
 * @Date 2019/6/26 14:10
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TransportProvider {
    @Autowired
    TransportService transportService;
    private final static Logger LOGGER = LoggerFactory.getLogger(TransportProvider.class);
    @Test
    public void before(){
        String id = "06f0bef4-5f20-4ad7-8178-3216f9a01b36";
        try {
            transportService.dele(id);
            LOGGER.info("delete id is success :{}",id);
        } catch (Exception e) {
            LOGGER.info("delete id is fail{}",id);
        }
    }
}
