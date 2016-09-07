package com.jumpluff.capture.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jumpluff.capture.model.User;
import com.jumpluff.capture.service.IUserService;

@Controller
@RequestMapping("/UserController")
public class UserController {
	
	@Resource
	IUserService UserServiceImpl;
	
	//访问路径 http://localhost:18383/webJumpluff/UserController/insert.do?name=路飞
	@RequestMapping("/insert")
	public String insert(HttpServletRequest request,Model model){
		String name = request.getParameter("name");
		
		User user = new User();
		user.setName(name);
		
		UserServiceImpl.insert(user);
		
		model.addAttribute("state", "success");
		return "test";
	}
}
