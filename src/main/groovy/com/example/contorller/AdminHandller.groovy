package com.example.contorller

import com.example.model.User
import com.example.service.UserServiceImp
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/admin")
class AdminHandller {

    @Autowired
    UserServiceImp userServiceImp

    @RequestMapping("/food")
    Object addFood(){
        println "hello"
        return "homepage"
    }
}
