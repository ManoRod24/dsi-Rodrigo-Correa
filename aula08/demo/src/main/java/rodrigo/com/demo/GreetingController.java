package rodrigo.com.demo;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // Essa classe vai receber requisições HTTP e devolver dados
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting") // Quando alguém fizer um GET para /greeting, execute esse método.
    public Greeting greeting(
            @RequestParam(defaultValue = "World") String name) {

        return new Greeting(
            counter.incrementAndGet(),
            template.formatted(name)
        );
    }
}
