package xyz.walun.service.impl;

import xyz.walun.dao.AccountDao;
import xyz.walun.dao.impl.AccountDaoImpl;
import xyz.walun.factory.BeanFactory;
import xyz.walun.service.AccountService;

public class AccountServiceImpl implements AccountService {
	public void saveAccount() {
//		AccountDao dao = new AccountDaoImpl();
		AccountDao dao = (AccountDao) BeanFactory.getBean("accountDao");
		dao.saveAccount();
	}
}
