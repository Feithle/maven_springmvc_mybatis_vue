package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class StudentController {
    @RequestMapping("/hello.do")
    public void hello(){
        System.out.println("Hello World");
    }

}
