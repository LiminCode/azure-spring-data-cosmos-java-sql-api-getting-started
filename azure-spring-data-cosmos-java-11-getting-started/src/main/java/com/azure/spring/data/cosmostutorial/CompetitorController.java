package com.azure.spring.data.cosmostutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/competitor")
public class CompetitorController {

    @GetMapping
    public String sayHello(){
        return "Hello";
    }
}
