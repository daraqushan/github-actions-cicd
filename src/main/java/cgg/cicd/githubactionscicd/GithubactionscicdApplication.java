package cgg.cicd.githubactionscicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubactionscicdApplication {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to CGG !";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubactionscicdApplication.class, args);
	}

}
