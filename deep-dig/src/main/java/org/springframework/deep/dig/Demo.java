package org.springframework.deep.dig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xumingming
 * @version 1.0
 * @date 2023/5/29 14:26
 */
public class Demo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("org.springframework.deep.dig");
		Object o = ctx.getBean("serviceBean");
		System.out.println(o);
	}
}
