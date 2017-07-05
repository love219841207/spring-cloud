package com.think.cloud.web.home.service.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.think.cloud.web.home.service.user.UserService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
public class HomeController {
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private UserService userService;
	@ApiOperation(value="get", notes="get")
    @ApiImplicitParam(name = "str", value = "str", required = true, dataType = "String",paramType="query")
	@GetMapping(value = "/get")
    public String get(@RequestParam String str) {
		logger.info("auth--->info:{}");
        String str1 = userService.sayName(str);
        return str1;
    }
	
	@ApiOperation(value="post", notes="post")
    @ApiImplicitParam(name = "str", value = "str", required = true, dataType = "String",paramType="path")
	@PostMapping(value = "/put/{str}")
    public String put(@PathVariable("str") String str) {
        String str1 = userService.sayName(str);
        return str1;
    }
}
