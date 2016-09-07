package com.jumpluff.capture.dao.mysql;

import com.jumpluff.capture.model.OssFileRelateMan;



public interface OssFileRelateManMapper {
    int insert(OssFileRelateMan record);

    int insertSelective(OssFileRelateMan record);
}