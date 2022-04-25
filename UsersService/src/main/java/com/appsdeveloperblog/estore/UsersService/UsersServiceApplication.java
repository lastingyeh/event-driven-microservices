package com.appsdeveloperblog.estore.UsersService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.appsdeveloperblog.estore.core.configs.AxonConfig;

@SpringBootApplication
@Import({ AxonConfig.class })
public class UsersServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersServiceApplication.class, args);
	}

}
