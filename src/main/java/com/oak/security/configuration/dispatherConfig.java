package com.oak.security.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class dispatherConfig  extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		Class[] ar= {appConfigure.class};
		return ar;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		
		
		String[] ar= {"/"};
		return ar;
		
		
		
	}
	
	
}
