package service;

import enums.Service2ExceptionEnum;
import exception.Service2Exception;

/**
 * Created By Lu Chuan On 2019/11/7
 */
public class Service2 {
	public void method1(int code) throws Service2Exception {
		if (code == 0) {
			throw new Service2Exception(Service2ExceptionEnum.TIP1);
		}
		System.out.println("execute service2 method1");
	}
	
	public void method2(int code) throws Service2Exception {
		if (code == 0) {
			throw new Service2Exception(Service2ExceptionEnum.TIP2);
		}
		System.out.println("execute service2 method2");
	}
	
	public void method3(int code) throws Service2Exception {
		if (code == 0) {
			throw new Service2Exception(Service2ExceptionEnum.TIP3);
		}
		System.out.println("execute service2 method3");
	}
	
	
	public void method4(int code) throws Service2Exception {
		if (code == 0) {
			throw new Service2Exception(Service2ExceptionEnum.TIP4);
		}
		System.out.println("execute service2 method4");
	}
}
