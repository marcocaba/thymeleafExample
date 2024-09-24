package org.jsp.THExamen;

import org.jsp.THExamen.Repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "org.jsp.THExamen")

public class THExamenApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(THExamenApplication.class, args);
	}
	@Autowired
	private userRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {

	}

}
