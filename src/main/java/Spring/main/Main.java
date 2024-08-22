package Spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Spring.model.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("application_context.xml");
		Employee bean = ioc.getBean("e1", Employee.class);
		System.out.println(bean) ;

//		Employee bean2 = ioc.getBean("e2", Employee.class);
//		System.out.println(bean2);
//		bean2.setId(202);
//		bean2.setName("Kunal");
//		System.out.println(bean2);
	}

}