package com.think.cloud.service.user.service;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
public class UserWeb extends BaseService<Long> {
	@ApiOperation(value="sayhello", notes="根据User对象创建用户 <br/>关联UC文档<a href='http://www.baidu.com' target='_blank '>关联UC文档</a>")
    @ApiImplicitParam(name = "name", value = "用户详细实体user", required = true, dataType = "String",paramType="path")
	@GetMapping("/say/{name}")
	public String serviceInstancesByApplicationName(
			@PathVariable String name) {
		return "Hello 1"+name ;
	}

	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public String info() {
		return "success";
	}
}
