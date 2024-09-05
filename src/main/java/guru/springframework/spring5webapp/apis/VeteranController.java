package guru.springframework.spring5webapp.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VeteranController {
    @GetMapping("/greet")
    public String greetTheUser(){
        return "hello";
    }

    @GetMapping("/")
    public String root(){
        return "this is the root";
    }
}
