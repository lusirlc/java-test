package proxy.dynamic;

import java.io.Serializable;

/**
 * Created By Lu Chuan On 2019/11/23
 */
public class ServiceImpl implements Service {
	@Override
	public void method() {
		System.out.println("I am service method");
	}
}
