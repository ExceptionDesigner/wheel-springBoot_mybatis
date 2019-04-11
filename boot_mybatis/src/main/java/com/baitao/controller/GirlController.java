package com.baitao.controller;

import com.baitao.Services.GirlService;
import com.baitao.pojo.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class GirlController {

    @Autowired
    private GirlService girlService;

    @RequestMapping("/girls")
    public List<Girl> getGirls(){
//        System.out.println(1);
        return  girlService.findAll();
    }

    @RequestMapping("/{id}")
    public Girl selectByPrimaryKey(@PathVariable("id") String id){

        return  girlService.selectByPrimaryKey(id);
    }
}
