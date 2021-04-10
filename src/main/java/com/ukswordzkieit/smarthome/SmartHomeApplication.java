package com.ukswordzkieit.smarthome;

import com.ukswordzkieit.smarthome.models.database.Godziny;
import com.ukswordzkieit.smarthome.models.database.Logoddana;
import com.ukswordzkieit.smarthome.models.database.Miesiaceogniwapk;
import com.ukswordzkieit.smarthome.services.GodzinyRepository;

import com.ukswordzkieit.smarthome.services.LogOddanaRepository;
import com.ukswordzkieit.smarthome.services.MiesiaceogniwapkRepository;
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
	public CommandLineRunner demo(MiesiaceogniwapkRepository repository)
	{
		return (args) ->{
			log.info("otrzymal");
			for (Miesiaceogniwapk godziny : repository.findAll())
			{
				String output = godziny.getId() + " " + godziny.getMiesiace();
				System.out.println(output);
			}
		};
	}

}
