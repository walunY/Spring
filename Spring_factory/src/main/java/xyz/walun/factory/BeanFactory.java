package xyz.walun.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * bean 是指可重用的组件
 * Javabean是指用Java语言编写的可重用的组件
 * Javabean  >  实体类
 *
 * beanFactory是创建bean对象的 :
 *      创建service和dao // 在web开发中 多个servlet调用service 再调用dao
 *
 *      创建;
 *          第一 必须有配置文件来配置Service和Dao
 *              必须包含唯一标志=全限定类名(k=v)
 *          第二 通过读取配置文件中的配置内容，反射创建对象
 *      配置文件：xml或者properties
 */
public class BeanFactory {
	private static  Properties properties;

	// 用于存储bean
	private static Map<String,Object> beans;
	static {
		try {
			properties = new Properties();
			InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
			properties.load(in);
			// 初始化
			beans = new HashMap<String,Object>();

			// 获得所有的配置文件的key
			Enumeration keys = properties.keys();
			// 将k对应的bean对象封装到beans中
			while (keys.hasMoreElements()){
				String key = keys.nextElement().toString();
				String beanPath = properties.getProperty(key);
				Object value = Class.forName(beanPath).newInstance();
				beans.put(key,value);
			}
		} catch (Exception e) {
			throw new ExceptionInInitializerError("初始化properties失败！");
		}
	}

	/**
	 * 这样的工厂创建出来的对象是多例的--会被创建多个，因为调用的是newInstance
	 * @param beanName
	 * @return
	 */
	/*public static Object getBeans(String beanName){
		Object bean = null;
		try {
			String beanPath = properties.getProperty(beanName);
			System.out.println(beanPath);
			bean = Class.forName(beanPath).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}*/
	public static Object getBean(String beanName){
		return beans.get(beanName);
	}
}
