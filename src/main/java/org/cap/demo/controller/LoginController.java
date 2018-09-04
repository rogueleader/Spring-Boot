package org.cap.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value="/validateUser",method=RequestMethod.POST)
	public ModelAndView validateLogin(@RequestParam("user") String user, @RequestParam("pass") String pass) {
		
		String page="/";
		if(user.equalsIgnoreCase("Tom")&&pass.equalsIgnoreCase("123"))
		{
			page="success";
			
			System.out.println("in test case");
		}
		
		return new ModelAndView(page,"user",user);
		
		
		
	}
}
