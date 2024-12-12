package com.example.tutoring;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "튜터링 수강신청 API",
				version = "1.0",
				description = "학생과 튜터의 1:1 수업 서비스에서 수강신청 API"
		)
)
public class TutoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutoringApplication.class, args);
	}

}
