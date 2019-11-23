package proxy.dynamic;

/**
 * Created By Lu Chuan On 2019/11/23
 */
public class Test {
	public static void main(String[] args) {
		DynamicServiceProxy proxy = new DynamicServiceProxy();
		proxy.setService(new ServiceImpl());
		Service o = (Service) proxy.getProxyInstance();
		o.method();
	}
}
