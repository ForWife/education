package com.neu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neu.po.Lesson;

@Mapper
public interface DemoMapper {
	public List<Lesson> findLessons() throws Exception;
}
