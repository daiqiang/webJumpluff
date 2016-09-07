package com.jumpluff.capture.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jumpluff.capture.model.OssFileRelateMan;
import com.jumpluff.capture.service.IOssFileRelateManService;

@Controller
@RequestMapping("/OssFileRelateMan")
public class OssFileRelateManController {
	@Resource
	private IOssFileRelateManService ossFileRelateManService;
	
	@RequestMapping("/insert")
	public String toIndex(HttpServletRequest request,Model model){
		int relateId = Integer.parseInt(request.getParameter("id"));
		String relateManName = request.getParameter("name");
		
		OssFileRelateMan record = new OssFileRelateMan();
		record.setRelateid(relateId);
		record.setRelatemanname(relateManName);
		ossFileRelateManService.insert(record);
		model.addAttribute("state", "success");
		return "test";
	}
}
