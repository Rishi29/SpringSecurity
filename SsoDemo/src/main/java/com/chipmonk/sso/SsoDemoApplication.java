package com.chipmonk.sso;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class SsoDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsoDemoApplication.class, args);
	}
	@GetMapping("/")
	public String welcomeUser(Principal principal) {

		return "Hi " + principal.getName() + ", welcome";

	}
}
