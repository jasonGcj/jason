package com.jason.mapper;

import com.jason.pojo.TransportTaskEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by GCJ on 2019/5/21 15:26
 */
@Mapper
public interface TransportMapper {
    List<TransportTaskEntity> query(@Param("id") String id);

    void save(TransportTaskEntity transport);

    void dele(@Param("id")String id);
}
