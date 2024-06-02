package com.example.demo.mainService;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.mainVo.MainVO;

public interface MainService {

	List<MainVO> getUser(MainVO vo) throws Exception;
}
