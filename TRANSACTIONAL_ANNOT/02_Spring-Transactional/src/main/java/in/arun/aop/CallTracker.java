package in.arun.aop;

import java.util.jar.Attributes.Name;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
//what code need to be here -> Which are non functional code
public class CallTracker {

	@Pointcut("within(in..service.*) || within(in..repository.*)")
	public void logMethodPointCut() {

	}
	// 40 mins Over

	// when the logic here should run before/after/before and after
	@Before("logMethodPointCut()")
	public void logBeforeMethodCall() {
		System.out.println("Execute this line before any method Method is starting ");
	}

	@Around("logMethodPointCut()")
	public Object logAfterMethodCall(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

		//Before
		String name = proceedingJoinPoint.getSignature().getName();
		System.out.println("method start : "+name);
		
		// Before call to your method
		Object returnValue = proceedingJoinPoint.proceed();
		System.out.println(returnValue);//null
		
		// After the method executed
		System.out.println("Method start : " + proceedingJoinPoint.getSignature().getName());

		return returnValue;

	}

}
