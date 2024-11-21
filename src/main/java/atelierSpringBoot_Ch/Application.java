package atelierSpringBoot_Ch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class Application implements CommandLineRunner{
	  @Autowired
	    private EmailService emailService;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	 @Override
	    public void run(String... args) throws Exception {
	        emailService.sendEmailAttachment("siwar.bengaji@gmail.com", "Reponse de Demmande", "Bonjour nous avons accepter votre demonade d'inscription vous pouver connecter votre compte ");
	    }
}
