package xyz.walun.factory;

import xyz.walun.service.AccountService;
import xyz.walun.service.impl.AccountServiceImpl;

/**
 * 模拟一个工厂类(该类可能存在于jar包中，我们无法通过修改源码来提供默认的构造函数)
 */
public class StaticFactory {
	public  static AccountService getAccountService(){
		return new AccountServiceImpl();
	}
}
