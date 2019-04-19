package xyz.walun.service.impl;

import xyz.walun.service.AccountService;

import java.util.Date;

public class AccountServiceImpl2 implements AccountService {
	// 经常变化的数据，不适用于注入的方式
	// 用户信息这类的信息不适用用配置文件的方式注入
	private String string;
	private Integer integer;
	private Date date;

	public void setString(String string) {
		this.string = string;
	}

	public void setInteger(Integer integer) {
		this.integer = integer;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void saveAccount() {

		System.out.println("service 中的saveAccount执行了"+string+integer+date);
	}
}
