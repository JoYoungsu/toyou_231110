package com.example.demo.mainMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.mainVo.MainVO;

@Mapper
public interface MainMapper {

	 List<MainVO> getUser(MainVO vo) throws Exception;
}
