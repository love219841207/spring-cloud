package com.think.cloud.service.user.service;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

public class BaseService<T> {
	@ApiOperation(value="base", notes="base")
    @ApiImplicitParam(name = "name", value = "用户详细实体user", required = true, dataType = "String",paramType="path")
	@GetMapping("/base/{id}")
	public T queryById(@PathVariable Long id) {
		return (T) id;
	}
}
