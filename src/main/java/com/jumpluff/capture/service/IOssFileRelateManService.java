package com.jumpluff.capture.service;

import com.jumpluff.capture.model.OssFileRelateMan;

public interface IOssFileRelateManService {
	public OssFileRelateMan getOssFileRelateManByRelateId(int relateId);
	public int insert(OssFileRelateMan record);
}
