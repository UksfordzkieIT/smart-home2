package com.ukswordzkieit.smarthome;

import com.ukswordzkieit.smarthome.models.database.Godziny;
import com.ukswordzkieit.smarthome.services.GodzinyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SmartHomeApplication {

	private static final Logger log = LoggerFactory.getLogger(SmartHomeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SmartHomeApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(GodzinyRepository repository)
	{
		return (args) ->{
			for (Godziny godziny : repository.findAll())
			{
				//String output = godziny.getId() + " "
				//		+ godziny.getGodzMax().toString() + " "
				//		+ godziny.getGodzMax().toString();
				log.info("otrzymal");
			}
		};
	}
}
