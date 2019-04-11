package com.baitao.dao;

import com.baitao.pojo.Girl;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component("girlMapper")
public interface GirlMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Girl record);

    int insertSelective(Girl record);

    Girl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Girl record);

    int updateByPrimaryKey(Girl record);

    List<Girl> findAll();
}