package com.qiaohx.mybatisdruid.controller;

import com.qiaohx.mybatisdruid.mapper.Emd5Mapper;
import com.qiaohx.mybatisdruid.model.Emd5;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/md5")
public class Md5Controller {

    @Resource
    private Emd5Mapper emd5Mapper;

    @RequestMapping("/getValue")
    public Emd5 getValue(){
        return  emd5Mapper.selectByPrimaryKey("202cb962ac59075b964b07152d234b70");
    }
}
