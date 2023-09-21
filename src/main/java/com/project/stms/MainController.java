package com.project.stms;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.stms.command.UserVO;

@Controller
public class MainController {


	@GetMapping("/")
	public String customer_main(HttpServletRequest request) {	
		
		HttpSession session = request.getSession();
		
		if(session != null) {
		
			UserVO userVO = (UserVO)session.getAttribute("userVO");
				if(userVO.getUser_role().equals("ROLE_ADMIN")) {
					
					/* 메인페이지 재로딩하면 userVO가 null이라는 에러떠서 저장함 */
					userVO.setUser_role("ROLE_ADMIN");
					
					return "redirect:/project/ProjectMain";
					
				} else if(userVO.getUser_role().equals("ROLE_ENGINEER")) {
					
					userVO.setUser_role("ROLE_ENGINEER");
					
					return "redirect:/task/taskDashboard";
					
				} 
			} 
			
		return "main";

	}
	
	@GetMapping("/layout_admin")
	public String layout_admin() {
		return "include/layout_admin";
	}
	
	@GetMapping("/layout_customer")
	public String layout_cutomer() {
		return "include/layout_customer";
	}
	
	@GetMapping("/layout_engineer")
	public String layout_engineer() {
		return "include/layout_engineer";
	}
	
	@GetMapping("/notification/notificationPopUp")
	public String notificationPopUp() {
		return "notification/notificationPopUp";
	}
	
	@GetMapping("/test/SseSubscribe")
	public String SseSubscribe() {
		return "test/SseSubscribe";
	}
}