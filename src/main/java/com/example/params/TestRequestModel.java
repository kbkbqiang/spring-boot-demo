package com.example.params;

import org.hibernate.validator.constraints.NotBlank;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/** 
 * @ClassName: TestRequestModel 
 * @Description TODO
 * @author zhaoqiang 
 * @date: 2016年9月5日 下午5:56:01 
 */
@Data
@ApiModel
public class TestRequestModel {
	
	@ApiModelProperty(value = "用户姓名",required = true)
	@NotBlank(message = "'用户姓名'不能为空")
	private String name;
	
	@ApiModelProperty(value = "用户住址",required = true)
	@NotBlank(message = "'用户住址'不能为空")
	private String address;

}
