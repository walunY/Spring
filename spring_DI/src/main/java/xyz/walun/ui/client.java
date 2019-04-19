package xyz.walun.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.walun.service.AccountService;


public class client {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("Bean.xml");
		AccountService service = (AccountService) ac.getBean("accountService");
		System.out.println(service);
		service.saveAccount();

	}
}
