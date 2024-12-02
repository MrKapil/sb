package com.Mobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sim.Sim;

public class RelianceMobile {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	private Sim r = context.getBean(Sim.class);
	
	public RelianceMobile() {
		startMobile();
		try {
		r.StartSim();
		}catch(NullPointerException e)
		{
			System.out.println(e);
		}
	}

	private void startMobile() {
		System.out.println("Welcome to reliance Mobile");
		
	}
	
	
}
