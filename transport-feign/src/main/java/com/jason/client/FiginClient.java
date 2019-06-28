package com.jason.client;

import com.jason.mapper.TransportMapper;
import com.jason.pojo.TransportTaskEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by GCJ on 2019/5/21 16:11
 */
@Component
@FeignClient("transport-provider")
public interface FiginClient {
    @RequestMapping(value = "/transport/query",method = RequestMethod.GET)
    public List<TransportTaskEntity> query();
}
