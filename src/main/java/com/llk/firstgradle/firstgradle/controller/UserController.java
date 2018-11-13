package com.llk.firstgradle.firstgradle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.llk.firstgradle.firstgradle.domain.User;
import com.llk.firstgradle.firstgradle.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserRepository userRepositry;
	/*
	 * 查询所有用户
	 */
	@GetMapping
	public ModelAndView list(Model model){
		
		model.addAttribute("userList",userRepositry.findAll());
		
		model.addAttribute("title","用户列表");
		return new ModelAndView("users/list","userModel",model);
		
	}
	
	/*
	 * 根据id查询用户
	 */
	@GetMapping("{id}")
	public ModelAndView view(@PathVariable("id") Long id,Model model){
		User user=userRepositry.findById(id).get();
		model.addAttribute("user",user);
		model.addAttribute("title","查看用户");
		return new ModelAndView("users/view","userModel",model);
		
	}
	/*
	 * 获取创建表单页面
	 */
	@GetMapping("/form")
	public ModelAndView createForm(Model model){
	
		model.addAttribute("user", new User(null,null,null));
		model.addAttribute("title","创建用户");
		return new ModelAndView("users/form","userModel",model);
		
	}
	
	@PostMapping
	public ModelAndView saveOrUpdateUser(User user){
		
		userRepositry.save(user);
		return new ModelAndView("redirect:/users");
	}
	
	/*
	 * 
	 * 删除用户
	 */
	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id,Model model){
		userRepositry.deleteById(id);
		return new ModelAndView("redirect:/users");
		
	}
	
	/*
	 * 获取修改用户界面
	 */
	@GetMapping("/modify/{id}")
	public  ModelAndView modify(@PathVariable("id") Long id,Model model){
		User user=userRepositry.findById(id).get();
		model.addAttribute("user", user);
		model.addAttribute("title","修改用户");
		return new ModelAndView("users/form","userModel",model);
		
	}
}
