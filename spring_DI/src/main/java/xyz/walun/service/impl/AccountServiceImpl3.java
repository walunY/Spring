package xyz.walun.service.impl;

import xyz.walun.service.AccountService;

import java.util.*;

public class AccountServiceImpl3 implements AccountService {
	// 经常变化的数据，不适用于注入的方式
	// 用户信息这类的信息不适用用配置文件的方式注入
	private String[] myStrs;
	private List<String> myList;
	private Set<String> mySet;
	private Map<String,String> myMap;
	private Properties properties;

	public void setMyStrs(String[] myStrs) {
		this.myStrs = myStrs;
	}

	public void setMyList(List<String> myList) {
		this.myList = myList;
	}

	public void setMySet(Set<String> mySet) {
		this.mySet = mySet;
	}

	public void setMyMap(Map<String, String> myMap) {
		this.myMap = myMap;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public void saveAccount() {
		System.out.println(Arrays.toString(myStrs));
		System.out.println(myList);
		System.out.println(myMap);
		System.out.println(mySet);
		System.out.println(properties);

	}
}
