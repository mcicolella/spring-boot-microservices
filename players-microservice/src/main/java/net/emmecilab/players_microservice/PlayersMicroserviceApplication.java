package net.emmecilab.players_microservice;

/**
 *
 * @author Mauro Cicolella
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PlayersMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayersMicroserviceApplication.class, args);
	}
}
