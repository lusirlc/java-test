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
public class Test2 {
	
	
	public static void main(String[] args) {
		Service1 service1 = new Service1();
		Service2 service2 = new Service2();
		int status = 0;
		try {
			service1.method1(1);
			service2.method1(0);
		} catch (Exception e) {
			if (e instanceof Service1Exception) {
				status =1;
			}
			if (e instanceof Service2Exception) {
				status =2;
			}
			e.printStackTrace();
		} finally {
			System.out.println(status);
		}
	}
}
