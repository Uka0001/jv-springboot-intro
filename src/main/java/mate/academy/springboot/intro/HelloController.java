package mate.academy.springboot.intro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String printHelloMessage() {
        return "Hello, mates!";
    }
}
