package com.accenture.shop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ShopAspects {

	@Before("execution(* com.accenture.*(..))")
	public void login(JoinPoint joinPoint) {
		
	}
}
