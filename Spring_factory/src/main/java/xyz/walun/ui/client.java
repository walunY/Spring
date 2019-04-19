package xyz.walun.ui;

import xyz.walun.factory.BeanFactory;
import xyz.walun.service.AccountService;

public class client {
	public static void main(String[] args) {
//		AccountService service = new AccountServiceImpl();
		AccountService service = (AccountService) BeanFactory.getBean("accountService");
		service.saveAccount();
	}
}
