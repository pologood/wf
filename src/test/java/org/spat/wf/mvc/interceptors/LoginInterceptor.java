package org.spat.wf.mvc.interceptors;

import org.spat.wf.mvc.BeatContext;
import org.spat.wf.mvc.WFInterceptor;

public class LoginInterceptor extends WFInterceptor{

	@Override
	public Boolean doFilter(BeatContext beat) throws Exception {
		System.out.println("excute cust LoginInterceptor..........................");
		return null;
	}

}