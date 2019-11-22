package exception;

import enums.Service1ExceptionEnum;

/**
 * Created By Lu Chuan On 2019/11/7
 */
public class Service1Exception extends RuntimeException {
	private int code;
	public Service1Exception(Service1ExceptionEnum exceptionEnum) {
		super(exceptionEnum.getMsg());
		this.code = exceptionEnum.getCode();
	}
}
