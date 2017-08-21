package attil.io.basic.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String [] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config1.class, Config2.class);

		AnotherBean anotherBean1 = (AnotherBean) applicationContext.getBean("anotherBean1");
		AnotherBean anotherBean2 = (AnotherBean) applicationContext.getBean("anotherBean2");
		
		System.out.println(anotherBean1.baseBean.getName());
		System.out.println(anotherBean2.baseBean.getName());
	}
}
