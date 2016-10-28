package com.jalisanarmard;

import com.jalisanarmard.domain.TimeCard;
import com.jalisanarmard.repository.TimeCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HrApplication implements CommandLineRunner {

	@Autowired
	TimeCardRepository timeCardRepository;

	public static void main(String[] args) {
		SpringApplication.run(HrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		TimeCard timeCard = new TimeCard("jondoe@gmail.com", "9:00", "10:00");
//		TimeCard timeCard1 = new TimeCard("jalisadoe@gmail.com", "9:00", "10:00");
//		TimeCard timeCard2 = new TimeCard("whokno@yeah.com", "9:00", "10:00");
//
//		timeCardRepository.save(timeCard);
//		timeCardRepository.save(timeCard1);
//		timeCardRepository.save(timeCard2);


	}
}
