package exception;

import enums.Service1ExceptionEnum;
import enums.Service2ExceptionEnum;

/**
 * Created By Lu Chuan On 2019/11/7
 */
public class Service2Exception extends RuntimeException {
	private int code;
	public Service2Exception(Service2ExceptionEnum exceptionEnum) {
		super(exceptionEnum.getMsg());
		this.code = exceptionEnum.getCode();
	}
}
