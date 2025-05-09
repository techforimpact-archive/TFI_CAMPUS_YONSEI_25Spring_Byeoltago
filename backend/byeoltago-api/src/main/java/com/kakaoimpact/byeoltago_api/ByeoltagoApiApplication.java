package com.kakaoimpact.byeoltago_api;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ByeoltagoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ByeoltagoApiApplication.class, args);
	}
}