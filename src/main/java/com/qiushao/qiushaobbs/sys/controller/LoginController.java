package com.qiushao.qiushaobbs.sys.controller;


import com.qiushao.qiushaobbs.common.core.domain.AjaxResult;
import org.apache.commons.lang3.StringEscapeUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @GetMapping("/login")
    @ResponseBody
    public AjaxResult test(){
        return AjaxResult.success();
    }

}
