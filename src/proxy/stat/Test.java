package proxy.stat;

/**
 * Created By Lu Chuan On 2019/11/23
 */
public class Test {
	public static void main(String[] args) {
		ServiceImpl service = new ServiceImpl();
		service.method();
		System.out.println("================");
		ServiceProxy serviceProxy = new ServiceProxy(service);
		serviceProxy.method();
	}
}
