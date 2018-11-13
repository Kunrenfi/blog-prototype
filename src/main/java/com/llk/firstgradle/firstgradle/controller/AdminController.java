package com.llk.firstgradle.firstgradle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 林力克 on 2018/11/12.
 */
@Controller
@RequestMapping("/admins")
public class AdminController {


    /**
     * 获取后台管理主页面
     *
     * @return
     */
    @GetMapping
    public ModelAndView listUsers(Model model) {
        return new ModelAndView("admins/index", "menuList", model);
    }

}