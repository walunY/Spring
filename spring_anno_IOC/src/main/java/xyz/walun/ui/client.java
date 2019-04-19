package xyz.walun.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.walun.service.AccountService;

/**
 *
 * ApplicationContext常用的三个实现类
 * ClassPathXmlApplicationContext       加载类路径文件下的配置文件
 * FileSystemApplicationContext         加载任意磁盘位置的配置文件(注意权限)
 * AnnotationConfigApplicationContext   读取注解创建容器
 *
 * 核心容器的两个接口
 *  ApplicationContext     单例对象使用           更多采用此接口
 *      在创建核心容器时采用立即加载的方式：读取完配置文件就立即创建配置文件中的对象
 *   BeanFactory           多例对象使用
 *      使用的是延迟加载的方式：            什么时候根据id获取了对象，什么时候真正的创建
 */
public class client {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("Bean.xml");
		AccountService service = (AccountService) ac.getBean("accountService");
		System.out.println(service);

	}
}
