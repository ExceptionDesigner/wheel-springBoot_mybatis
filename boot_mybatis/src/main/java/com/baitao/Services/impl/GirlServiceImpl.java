package com.baitao.Services.impl;

import com.baitao.Services.GirlService;
import com.baitao.dao.GirlMapper;
import com.baitao.pojo.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("girlService")
public class GirlServiceImpl implements GirlService {

    @Autowired
    private GirlMapper girlMapper;

    @Override
    public List<Girl> findAll() {
//        System.out.println(2);
        return girlMapper.findAll();
    }

    @Override
    public Girl selectByPrimaryKey(String id) {
        return girlMapper.selectByPrimaryKey(Integer.parseInt(id));
    }

}
