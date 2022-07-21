package sg.edu.nus.iss.d13revision;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.*;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@SpringBootApplication
public class D13revisionApplication {

	public static void main(String[] args) {
		// SpringApplication.run(D13revisionApplication.class, args);

		SpringApplication app = new SpringApplication(D13revisionApplication.class);

		//when you specify the port then when you run the default 8085
		String port="8085";
		ApplicationArguments cliOpts = new DefaultApplicationArguments(args);

		if (cliOpts.containsOption("port")) {
			port = cliOpts.getOptionValues("port").get(0);
		}

		//this piece of code is to specify the port, so if you already specify in the application.properties
		//then you dont need this code
		app.setDefaultProperties(
			Collections.singletonMap("server.port", port)
		);

		app.run(args);
	}

	@Bean
	public CommonsRequestLoggingFilter log() {
		CommonsRequestLoggingFilter logger = new CommonsRequestLoggingFilter();
		logger.setIncludeClientInfo(true);
		logger.setIncludeQueryString(true);
		return logger;
	}
}
