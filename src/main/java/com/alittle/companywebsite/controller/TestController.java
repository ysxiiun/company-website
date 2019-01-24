package com.alittle.companywebsite.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ysx
 * @date 2019/1/24
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {

	@ApiOperation(value = "测试前后台连同接口")
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView test() {
		ModelAndView mav = new ModelAndView("test");
		mav.addObject("hello", "hello, this is a company website");
		return mav;
	}

	@ApiOperation(value = "测试打开网站首页功能")
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView index() {
		return new ModelAndView("index");
	}

	@ApiOperation(value = "带有参数的get请求", notes = "传入str值，修改页面内容")
	@RequestMapping(value = "/change", method = RequestMethod.GET)
	public ModelAndView change(@ApiParam(value = "要改成的字符串", required = true) String str) {
		ModelAndView mav = new ModelAndView("test");
		mav.addObject("hello", str);
		return mav;
	}
}
