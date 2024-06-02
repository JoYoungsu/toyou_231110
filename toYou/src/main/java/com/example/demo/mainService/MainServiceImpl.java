package com.example.demo.mainService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mainMapper.MainMapper;
import com.example.demo.mainVo.MainVO;

@Service
public class MainServiceImpl implements MainService{

	@Autowired
	private MainMapper dao;
	
	@Override
	public List<MainVO> getUser(MainVO vo) throws Exception {
		//return null;
		return dao.getUser(vo);
	}
	
}
