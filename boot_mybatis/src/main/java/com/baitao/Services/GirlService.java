package com.baitao.Services;

import com.baitao.pojo.Girl;

import java.util.List;
import java.util.Map;

public interface GirlService {

    List<Girl> findAll();

    Girl selectByPrimaryKey(String id);
}
