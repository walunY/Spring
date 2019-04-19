package xyz.walun.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.walun.dao.AccountDao;
import xyz.walun.service.AccountService;

/**
 * <bean id="accountService" class="xyz.walun.service.impl.AccountServiceImpl"></bean>
 */
public class AccountServiceImpl implements AccountService {
	public void saveAccount() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("Bean.xml");
		AccountDao dao = (AccountDao) ac.getBean("accountDao");
		System.out.println(dao);
		dao.saveAccount();
	}
}
