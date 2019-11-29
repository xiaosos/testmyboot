package com.cbhb.testmyboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cbhb")
public class OpenPort {

    @RequestMapping("/test")
    public String test(){
        return "xiaosos,testmyboot,11111----2222  k8s ok <br> \n";
    }
    
    

}
