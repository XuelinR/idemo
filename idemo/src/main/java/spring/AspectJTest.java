/**
 * Copyright 2019 CoderDream's Studio All right reserved.
 * Created on 2019年11月25日 上午11:38:56
 */
package spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author admin
 *
 */
@Aspect
@Component
public class AspectJTest {
	@Pointcut("execution(* MyTestBean.test(..))")
	public void test() {}
	
	@Before("test()")
	public void beforeTest() {
		System.out.println("beforeTest");
	}
	
	@After("test()")
	public void afterTest() {
		System.out.println("afterTest");
	}
	@Around("test()")
	public Object aroundTest(ProceedingJoinPoint p) {
		System.out.println("before1");
		Object o = null;
		try {
			o = p.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return o;
	}
}
