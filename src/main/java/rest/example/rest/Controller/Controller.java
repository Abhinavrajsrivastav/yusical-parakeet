package rest.example.rest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping(path = "/")
    public String helloWorld() {
        return "Hello World";
    }
}