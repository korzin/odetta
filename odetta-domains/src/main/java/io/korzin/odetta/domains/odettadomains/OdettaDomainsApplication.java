package io.korzin.odetta.domains.odettadomains;

import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

//@EnableSwagger2
@SpringBootApplication
public class OdettaDomainsApplication implements CommandLineRunner{

	@Autowired
	Environment environment;

	@Autowired
	MongoClient mongoClient;


	public static void main(String[] args) {
		SpringApplication.run(OdettaDomainsApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {

		System.out.println("@!!!!!@");
		if (arg0.length > 0 && arg0[0].equals("exitcode")) {
			throw new ExitException();
		}
	}

	private class ExitException extends RuntimeException implements ExitCodeGenerator {
		private static final long serialVersionUID = 1L;

		@Override
		public int getExitCode() {
			return 10;
		}

	}
}
