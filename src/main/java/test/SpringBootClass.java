package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.ilkaygunel.controllers", "com.ilkaygunel.tiles", "test" })
public class SpringBootClass {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootClass.class, args);
	}
}
