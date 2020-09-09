package com.zzb.module.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author zengzhibin
 * @Date 2020/9/8 4:58 下午
 * @Version 1.0
 **/
@Controller
@RequestMapping("/test")
@Slf4j
public class TestController {

    @GetMapping("/index")
    public String index(){
        log.info("go to page index.html");
        return "index";
    }

}
