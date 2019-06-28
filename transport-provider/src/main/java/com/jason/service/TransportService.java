package com.jason.service;

import com.jason.mapper.TransportMapper;
import com.jason.pojo.TransportTaskEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by GCJ on 2019/5/21 14:56
 */
public interface TransportService {
    List<TransportTaskEntity> query(String id);

    void save(TransportTaskEntity transport);

    void dele(String id);
}
