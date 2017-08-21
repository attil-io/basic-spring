package attil.io.basic.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config1 {

	@Bean
	public BaseBean baseBean() {
		return new Bean1();
	}
	
	@Bean
	public AnotherBean anotherBean1() {
		return new AnotherBean(baseBean());
	}

}
