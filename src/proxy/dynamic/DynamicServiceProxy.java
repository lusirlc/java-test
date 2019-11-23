package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created By Lu Chuan On 2019/11/23
 */
public class DynamicServiceProxy implements InvocationHandler {
	private Object service;
	
	public Object getService() {
		return service;
	}
	
	public void setService(Object service) {
		this.service = service;
	}
	
	public Object getProxyInstance() {
		return Proxy.newProxyInstance(service.getClass().getClassLoader(), service.getClass().getInterfaces(), this);
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		doSomethingBefore();
		Object o = method.invoke(service, args);
		doSomethingAfter();
		return o;
	}
	
	private void doSomethingBefore() {
		System.out.println("do something before");
	}
	
	private void doSomethingAfter() {
		System.out.println("do something after");
	}
}
