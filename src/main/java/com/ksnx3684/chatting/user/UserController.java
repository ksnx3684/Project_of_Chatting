package com.ksnx3684.chatting.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user/*")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public void join() throws Exception {
		
	}
	
	@RequestMapping(value = "join", method = RequestMethod.POST)
	public String join(UserDTO userDTO) throws Exception {
		int result = userService.join(userDTO);
		return "redirect:../";
	}
	
	@RequestMapping(value = "withdrawal", method = RequestMethod.GET)
	public void withdrawal() throws Exception {
		
	}
	
	public String withdrawal(UserDTO userDTO) throws Exception {
		int result = userService.withdrawal(userDTO);
		return "";
	}
	
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public String detail(UserDTO userDTO, Model model) throws Exception {
		userDTO = userService.detail(userDTO);
		model.addAttribute("dto", userDTO);
		return "detail";
	}
	
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public void update() throws Exception {
		
	}
	
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(UserDTO userDTO) throws Exception {
		int result = userService.update(userDTO);
		return "redirect:../";
	}

}
