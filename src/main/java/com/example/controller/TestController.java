package com.example.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.params.TestRequestModel;
import com.example.utils.ToJsonUtil;


/** 
 * @ClassName: TestController 
 * @Description TODO
 * @author zhaoqiang 
 * @date: 2016年9月5日 下午5:25:05 
 */
@RestController
@RequestMapping(value ="/test/")
@Api(value = "测试控制类", description = "(TestController)")
public class TestController {
	
	@RequestMapping(value = "hello", method = RequestMethod.POST)
	@ApiOperation(value = "测试输出hello world",httpMethod = "POST")
	public String hello(@Valid @RequestBody TestRequestModel model) {
		try{
			
		}catch(Exception e){
			return ToJsonUtil.exceptionToResult(e);
		}
		return "hello world";
	}
	
}
