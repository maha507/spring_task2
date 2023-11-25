package spring_task2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import spring_task2.dao.Userdao;
import spring_task2.dto.User;


@Controller
public class Usercontroller {
	@Autowired
	private Userdao userdao;
	
	
	@RequestMapping("/register")
	public ModelAndView register() {
		ModelAndView andView=new ModelAndView();
		andView.addObject("user", new User());
		andView.setViewName("register.jsp");
		return andView;
	}
	@RequestMapping("/save")
	public ModelAndView save(@ModelAttribute User user) {
		ModelAndView andView=new ModelAndView();
		userdao.saveuser(user);
		List<User> list=userdao.getallUsers();
		andView.addObject("list",list);
		andView.setViewName("display.jsp");
		return andView;
		
	}

}
