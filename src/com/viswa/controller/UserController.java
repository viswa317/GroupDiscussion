package com.viswa.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.viswa.service.UserService;

@Controller
@RequestMapping(value="/member")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String create(HttpServletRequest request,Model model){
		request.setAttribute("wr", "Welcome From Request");
		model.addAttribute("wm", "Welcome From Model");
		return "user/create";
	}
}
