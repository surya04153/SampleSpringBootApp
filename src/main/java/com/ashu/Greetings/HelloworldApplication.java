package com.ashu.Greetings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class HelloworldApplication {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "<marquee behavior=\"scroll\" direction=\"left\" scrollamount=\"10\"><h1>My first AWS based springboot web application-Kudos surya</h1></marquee>\n" + "";
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

}

