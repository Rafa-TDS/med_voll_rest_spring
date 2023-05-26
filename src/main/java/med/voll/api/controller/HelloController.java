package med.voll.api.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello") //se chegar alguma requisição para localhost:8080/hello, irá cair nesse controller

public class HelloController {

    @GetMapping
    public String olaMundo(){
        return "Hello World Spring!";
    }


}

