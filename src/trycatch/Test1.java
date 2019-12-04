package trycatch;

import enums.Service1ExceptionEnum;
import enums.Service2ExceptionEnum;
import exception.Service1Exception;
import exception.Service2Exception;
import service.Service1;
import service.Service2;



/**
 * Created By Lu Chuan On 2019/11/7
 */
public class Test1 {
	
	
	public static void main(String[] args) {
		Service1 service1 = new Service1();
		Service2 service2 = new Service2();
		int status = 0;
		try {
			service1.method1(1);
			service2.method1(1);
			service2.method2(0);
		} catch (Service1Exception e) {
			if (e.getMessage().equals(Service1ExceptionEnum.TIP1.getMsg())) {
				status =1;
			}
			e.printStackTrace();
			System.out.println(e);
		} catch (Service2Exception e) {
			if (e.getMessage().equals(Service2ExceptionEnum.TIP1.getMsg())) {
				status =2;
			}
			if (e.getMessage().equals(Service2ExceptionEnum.TIP2.getMsg())) {
				status =3;
			}
			StackTraceElement element = e.getStackTrace()[0];
			System.out.println(element.getClassName());
			System.out.println(element.getMethodName());
			System.out.println(element.getLineNumber());
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println(status);
		}
	}
}
