package pastelpastel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RecheioldConfig {
	@Bean(name="Queijo")
	public Recheio obtemRecheioQueijo(){
		return new Queijo();
	}
	@Bean(name="Carne")
	public Recheio obtemRecheioCarne(){
		return new Carne();
	}

}
