package com.jumpluff.capture.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jumpluff.capture.dao.mysql.OssFileRelateManMapper;
import com.jumpluff.capture.dao.mysql.UserMapper;
import com.jumpluff.capture.model.OssFileRelateMan;
import com.jumpluff.capture.model.User;
import com.jumpluff.capture.service.IUserService;

@Service("userServiceImpl")
public class UserServiceImpl implements IUserService{

	@Resource
	private UserMapper userMapper;
	
	@Resource
	private OssFileRelateManMapper ossFileRelateManMapper;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public int insert(User user) {
		int re = userMapper.insert(user);
		return re;
	}

}
