package service;

import enums.Service1ExceptionEnum;
import exception.Service1Exception;

/**
 * Created By Lu Chuan On 2019/11/7
 */
public class Service1 {
	public void method1(int code) throws Service1Exception {
		if (code == 0) {
			throw new Service1Exception(Service1ExceptionEnum.TIP1);
		}
		System.out.println("execute service1 method1");
	}
	
	public void method2(int code) throws Service1Exception {
		if (code == 0) {
			throw new Service1Exception(Service1ExceptionEnum.TIP2);
		}
		System.out.println("execute service1 method2");
	}
	
	public void method3(int code) throws Service1Exception {
		if (code == 0) {
			throw new Service1Exception(Service1ExceptionEnum.TIP3);
		}
		System.out.println("execute service1 method3");
	}
	
	public void method4(int code) throws Service1Exception {
		if (code == 0) {
			throw new Service1Exception(Service1ExceptionEnum.TIP4);
		}
		System.out.println("execute service1 method4");
	}
}
