package org.study.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnlineCounterListener implements HttpSessionListener {
	// 1、sessionCreated()
	// 2、sessionDestroyed()
	public void sessionCreated(HttpSessionEvent evt) {
		OnlineCounter.increase();
		//evt.getSession().setMaxInactiveInterval(10);
		//System.out.println("session created: " + evt.getSession().getId());
	}
	
	public void sessionDestroyed(HttpSessionEvent evt) {
		OnlineCounter.decrease();
		//System.out.println("session destroyed: " + evt.getSession().getId());
	}
	
	
}
