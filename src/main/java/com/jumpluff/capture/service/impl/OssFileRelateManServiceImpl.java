package com.jumpluff.capture.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jumpluff.capture.dao.mysql.OssFileRelateManMapper;
import com.jumpluff.capture.model.OssFileRelateMan;
import com.jumpluff.capture.service.IOssFileRelateManService;

@Service("OssFileRelateManServiceImpl")
public class OssFileRelateManServiceImpl implements IOssFileRelateManService{

	@Resource
	private OssFileRelateManMapper ossFileRelateManMapper;
	
	@Override
	public OssFileRelateMan getOssFileRelateManByRelateId(int relateId) {
		// TODO Auto-generated method stub
		
		OssFileRelateMan record = new OssFileRelateMan();
		record.setRelateid(1);
		record.setRelatemanname("测试");
		try {
			ossFileRelateManMapper.insert(record);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public int insert(OssFileRelateMan record) {
		
		return ossFileRelateManMapper.insert(record);
	
	}

}
