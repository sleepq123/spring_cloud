package cn.sleepq123.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class OrderApplication {
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
	}
	
	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}
}
