package com.llk.firstgradle.firstgradle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 主页控制器
 * Created by 林力克 on 2018/11/12.
 */
@Controller
@RequestMapping("/blogs")
public class BlogController {
    @GetMapping
    public String listBlogs(@RequestParam(value = "order",required = false,defaultValue = "new") String order,
                            @RequestParam(value = "keyword",required = false,defaultValue = "") String keyword){
        System.out.println("order:"+order+" keyword:"+keyword);
        return  "redirect:/index?order="+order+"&tag="+keyword;

    }





}
