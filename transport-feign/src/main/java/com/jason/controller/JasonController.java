package com.jason.controller;

import com.jason.client.FiginClient;
import com.jason.mapper.TransportMapper;
import com.jason.pojo.Result;
import com.jason.pojo.TransportTaskEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import sun.net.www.http.HttpClient;

import java.util.List;

/**
 * Created by GCJ on 2019/5/21 16:31
 */
@RestController
public class JasonController {

    @Autowired
    FiginClient figinClient;
    @Autowired
    RestTemplate restTemplate;


    @RequestMapping("/get")
    public Result get(){
        System.out.println("111111111111111111");
        List<TransportTaskEntity> query = figinClient.query();
        System.out.println("---------------------------"+query);
        return new Result(true,"200","查到了");
    }

    @RequestMapping("/get1")
    public Result get1(){
        ResponseEntity<List> forEntity = restTemplate.getForEntity("http://localhost:8000/transport/query?id=2", List.class);
        List body = forEntity.getBody();
        return new Result(true,"200","查到了",body);
    }
}
