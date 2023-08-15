package itselfeducation.tacocloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//annotation of entry point - main class is here
//include:
//@SpringBootConfiguration - special form @Configuration
//@EnableAutoConfiguration - autoconfiguration S~pringBoot, auto setting components, which we use
//@ComponentScan - component scanning, provide option for using other classes @Component,@Controller & @Service
@SpringBootApplication
public class TacoCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplication.class, args);
	}

}
