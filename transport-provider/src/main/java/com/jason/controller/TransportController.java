package com.jason.controller;

import com.jason.pojo.Result;
import com.jason.pojo.TransportTaskEntity;
import com.jason.service.TransportService;
import org.apache.rocketmq.remoting.protocol.RocketMQSerializable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.misc.Request;

import java.util.List;

/**
 * Created by GCJ on 2019/5/21 14:41
 */
@RestController
@RequestMapping(value = "/transport")
public class TransportController {

    @Autowired
    private TransportService transportService;

    @RequestMapping(value = "/query",method = RequestMethod.GET)
    public Result query(@RequestParam String id){
        List<TransportTaskEntity> query = transportService.query(id);
        System.out.println(query+".................");
        return new Result(true,"200","查询成功",query);
    }

    /**
     * id：存在则更新 不存在则添加
     * @param transport
     * @return
     */
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public Result save(@RequestBody TransportTaskEntity transport){
        try {
            transportService.save(transport);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"300","添加or修改失败",e);
        }
        return new Result(true,"200","添加成功");
    }

    @RequestMapping(value = "/dele",method = RequestMethod.DELETE)
    public Result dele(@RequestParam("id") String id){
        transportService.dele(id);
        return new Result(true,"200","删除成功");
    }
}
