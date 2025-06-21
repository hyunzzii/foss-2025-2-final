package demo.cicd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${secrets.test}")
    private String secrets;

    @GetMapping
    public String helloWorld() {
        return "helloWorld";
    }

    @GetMapping("/secrets")
    public String getSecrets() {
        return "Secrets: " + secrets;
    }
}

