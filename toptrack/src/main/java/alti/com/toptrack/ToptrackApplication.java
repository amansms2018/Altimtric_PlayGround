package alti.com.toptrack;

import alti.com.toptrack.model.APIKey;
import alti.com.toptrack.model.URI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ToptrackApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToptrackApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	@Bean
	public URI uri(){
		return new URI();
	}
	@Bean
	public APIKey apiKey(){
		return new APIKey();
	}
}
