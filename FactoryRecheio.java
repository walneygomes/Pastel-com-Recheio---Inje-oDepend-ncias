package pastelpastel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class FactoryRecheio {

	public Recheio obterRecheio(String tipo) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(RecheioldConfig.class);
		if ("Queijo".equals(tipo)) {
			return (Recheio) context.getBean("Queijo");

		} else if ("Carne".equals(tipo)) {
			return (Recheio) context.getBean("Carne");

		}
		return null;

	}

}
