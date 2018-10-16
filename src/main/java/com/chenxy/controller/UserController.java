package com.chenxy.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname: UserController
 * @description: 用户访问层
 * @author: chenxy
 * @create: 2018-10-15 19:26
 * @version: 1.0
 **/
@RestController
@Api("用户管理")
public class UserController {

    /** 
    * @Description: 测试方法 
    * @Param: [name] 
    * @return: java.util.List<java.lang.String> 
    * @Author: chenxy
    * @Date: 2018/10/15
    */
    @ApiOperation(value = "获取Index信息",notes="信息列表")
    @RequestMapping(value = "/index1",method = {RequestMethod.POST,RequestMethod.GET})
    public List<String> getIndex(@ApiParam(value = "姓名", required = true)@RequestParam String name){
        List<String> treeList=new ArrayList<String>();
        if (name==null&&"".equals(name)){
            treeList.add("您输入的名字为空，请重新输入！");
            return treeList;
        }
        treeList.add("nihao哟");
        treeList.add("jiayouba,骚年");
        return treeList;
    }
    @ApiOperation(value="获取helloworld",httpMethod = "ALL",
            notes="接口发布说明")
    @RequestMapping(value = "/index2")
    public String getHelloWorld(){
        return "hello world";
    }
}
