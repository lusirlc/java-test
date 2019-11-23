package exception.test;

/**
 * Created By Lu Chuan On 2019/11/22
 */
public class ExceptionTest {
	public static void main(String[] args) {
		ExceptionTestService service = new ExceptionTestService();
		try {
			service.method1();//如果不try...catch编译时就会报错，因为继承了Exception
		} catch (Exception1 exception1) {
			exception1.printStackTrace();
		}
		
		service.method2();//编译时不会报错，即使声明了异常，因为继承了RuntimeException
	}
}
