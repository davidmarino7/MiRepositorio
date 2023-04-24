package training.spring.main;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("training.spring.*")
public class RestServiceApplication {

	public RestServiceApplication() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);

	}

}
