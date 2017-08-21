package attil.io.basic.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config2 {

	@Bean
	public BaseBean baseBean() {
		return new Bean2();
	}

	@Bean
	public AnotherBean anotherBean2() {
		return new AnotherBean(baseBean());
	}

}
