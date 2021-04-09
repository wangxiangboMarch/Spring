package com.wxb;

import com.wxb.bean.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController // 其实是 @Controller 和 @ResponseBody（返回数据） 的合体
public class HelloController {


    @Autowired
    Pet pet;

    @RequestMapping("/hello")
    public Pet handle01(){
        return pet;
    }

}
