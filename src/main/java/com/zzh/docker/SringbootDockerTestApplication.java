package com.zzh.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SringbootDockerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SringbootDockerTestApplication.class, args);
	}

	@GetMapping("docker/test")
	public Object test(){
		return "spting boot docker start";
	}
}
