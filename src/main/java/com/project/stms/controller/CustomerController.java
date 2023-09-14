package com.project.stms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.stms.command.UserVO;
import com.project.stms.user.service.UserService;


@Controller
public class CustomerController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/api/customer/main")
	public String customer(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		String user_email = (String)session.getAttribute("user_email");
		
		model.addAttribute("user_email", user_email);
		System.out.println("커스토머메인");
		
		List<UserVO> list = userService.userInfo(user_email);
		System.out.println(list.toString());
		
		return "customer/main";
	}
}
