package com.jason.serviceimpl;

import com.jason.mapper.TransportMapper;
import com.jason.pojo.TransportTaskEntity;
import com.jason.service.TransportService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by GCJ on 2019/5/21 14:58
 */
@Service
public class TransportServiceImpl implements TransportService {
    @Autowired
    private TransportMapper transportMapper;

    @Override
    public List<TransportTaskEntity> query(String id) {
        return transportMapper.query(id);
    }

    @Override
    public void save(TransportTaskEntity transport) {
        if(StringUtils.isEmpty(transport.getId())) transport.setId(UUID.randomUUID().toString());
        transport.setCreatTime(new Date());
        System.out.println("------------------------------------->"+new Date());
        transportMapper.save(transport);
    }

    @Override
    public void dele(String id) {
        transportMapper.dele(id);
    }
}
