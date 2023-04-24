package training.spring.resource;

import org.springframework.web.bind.annotation.*;

import training.spring.domain.Greeting;

@RestController
public class GreetingResource {
	
	private static final String template = "Hello, %s!";
	
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name", defaultValue = "World") String name) {
		
		return new Greeting(12, String.format(template, name));
	}

}
