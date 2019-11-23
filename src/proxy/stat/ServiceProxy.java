package proxy.stat;

/**
 * Created By Lu Chuan On 2019/11/23
 */
public class ServiceProxy implements Service {
	private ServiceImpl service;
	
	public ServiceProxy(ServiceImpl service) {
		this.service = service;
	}
	
	@Override
	public void method() {
		doSomethingBefore();
		service.method();
		doSomethingAfter();
	}
	
	private void doSomethingBefore() {
		System.out.println("do something before");
	}
	
	private void doSomethingAfter() {
		System.out.println("do something after");
	}
}
