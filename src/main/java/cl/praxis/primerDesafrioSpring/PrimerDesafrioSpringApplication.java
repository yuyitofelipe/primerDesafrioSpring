package cl.praxis.primerDesafrioSpring;
import cl.praxis.primerDesafrioSpring.model.Persona;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimerDesafrioSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PrimerDesafrioSpringApplication.class, args);
	}

@Override
	public void run(String... args) throws Exception {
		Persona persona = new Persona("Felipe", "Barriga", 30);
		System.out.println(persona);
	}

}
