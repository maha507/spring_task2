package spring_task2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public ModelAndView save1(@ModelAttribute User user) {
		ModelAndView andView=new ModelAndView();
		userdao.saveuser(user);
		List<User> list=userdao.getallUsers();
		andView.addObject("list",list);
		andView.setViewName("display.jsp");
		return andView;
		
	}
	
	@RequestMapping("/display")
	public ModelAndView save(User user) {
		ModelAndView andView=new ModelAndView();
		userdao.saveuser(user);
		List<User> list= userdao.getallUsers();
		andView.addObject("list", list);
		andView.setViewName("display.jsp");
		return andView;
		
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam int id) {
		ModelAndView andView=new ModelAndView();
		boolean b= userdao.deleteUser(id); 
		if (b) { 
			List<User> list=userdao.getallUsers();
			andView.addObject("user",list);
			andView.setViewName("display.jsp");
		} else {
			andView.setViewName("index.jsp");
		}
		return andView;
	}
	
	@RequestMapping("/edit")
	public ModelAndView edit(@RequestParam int id) {
		ModelAndView andView=new ModelAndView();
		User user= userdao.geteUserbyid(id);
		andView.addObject("user",user);
		andView.setViewName("edit.jsp");
		return andView;
		
	}
	@RequestMapping("/update")
	public ModelAndView update(@ModelAttribute User user) {
		ModelAndView andView = new ModelAndView();
		userdao.updateUser(user);
		List<User> list = userdao.getallUsers();
		andView.addObject("list", list);
		andView.setViewName("display.jsp");
		return andView;
	}

}
