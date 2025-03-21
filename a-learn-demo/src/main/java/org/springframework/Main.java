package org.springframework;

import org.springframework.anno.ConfigBean;
import org.springframework.anno.ConfigBean2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author weibb
 */
public class Main {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigBean.class);
		for (String beanName : context.getBeanDefinitionNames()) {
			String[] aliases = context.getAliases(beanName);
			System.out.println(String.format("bean名称:%s,别名:%s,bean对象:%s",
					beanName,
					Arrays.asList(aliases),
					context.getBean(beanName)) + "\n");
		}

		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(ConfigBean2.class);
		for (String beanName : context2.getBeanDefinitionNames()) {
			//别名
			String[] aliases = context2.getAliases(beanName);
			System.out.printf("bean名称:%s,别名:%s,bean对象:%s%n",
					beanName,
					Arrays.asList(aliases),
					context2.getBean(beanName));
		}
	}
}