package in.saffu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext contx = SpringApplication.run(Application.class, args);
		UserServices bean = contx.getBean(UserServices.class);
		bean.saveUser();
	}

}
