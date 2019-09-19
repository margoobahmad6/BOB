package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
		// start container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("co/nt/cfgs/applicationContext.xml");
		//retrieve the bean object
		HelloBean hb=ctx.getBean("hello",HelloBean.class);
		//call the method
		hb.Show();

	}

}
