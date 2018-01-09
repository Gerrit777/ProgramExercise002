package hello;

import java.util.concurrent.atomic.AtomicLong;


import org.springframework.web.bind.annotation.*;


@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/GerritTest1")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/GerritTest2")
    public Exit exit(@RequestParam(value = "name", defaultValue = "Amerika") String name) {
        return new Exit(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/shutdown")
    public void shutdown(){
        System.exit(500);
    }
}


