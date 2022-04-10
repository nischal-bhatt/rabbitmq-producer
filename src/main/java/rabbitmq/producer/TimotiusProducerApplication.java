package rabbitmq.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import rabbitmq.producer.producer.HelloRabbitProducer;

@SpringBootApplication
public class TimotiusProducerApplication implements CommandLineRunner{

	@Autowired
	private HelloRabbitProducer producer;
	
	public static void main(String[] args) {
		SpringApplication.run(TimotiusProducerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	   producer.sendHello("rat ki laat u" + Math.random());	
	}

}
