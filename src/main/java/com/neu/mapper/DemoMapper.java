package com.neu.mapper;

import com.neu.po.Lesson;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DemoMapper {
    public List<Lesson> findLessons() throws Exception;
}
