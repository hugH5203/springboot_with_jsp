package com.springboot_with_jsp.compatible.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author HuangHai
 * @date 2021/4/16 16:52
 */
@Controller
public class SuccessController {

    @GetMapping("cs")
    public String success(ModelMap modelMap){
        modelMap.addAttribute("msg","ModelMap里的值");
        return "success";
    }

    @RequestMapping("go")
    public String go(){
        return "success";
    }
}
