package mx.com.telcel.sipab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SipabWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SipabWebServiceApplication.class, args);
	}

}
