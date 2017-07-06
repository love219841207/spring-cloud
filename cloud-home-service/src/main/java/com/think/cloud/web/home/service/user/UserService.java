package com.think.cloud.web.home.service.user;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@FeignClient(value="user-service",fallback = UserServiceHystric.class)
public interface UserService {
	@ApiOperation(value="sayhello", notes="根据User对象创建用户 <br/>关联UC文档<a href='http://www.baidu.com' target='_blank '>关联UC文档</a>")
    @ApiImplicitParam(name = "name", value = "用户详细实体user", required = true, dataType = "String",paramType="path")
	@GetMapping("/say/{name}")
	public String sayName(@PathVariable("name") String name);
}
