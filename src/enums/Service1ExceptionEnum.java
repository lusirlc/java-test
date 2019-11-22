package enums;

/**
 * Created By Lu Chuan On 2019/11/7
 */
public enum Service1ExceptionEnum {
	TIP1(1001,"错误提示1"),
	TIP2(1002,"错误提示2"),
	TIP3(1003,"错误提示3"),
	TIP4(1004,"错误提示4"),
	;
	
	private int code;
	private String msg;
	
	Service1ExceptionEnum(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getMsg() {
		return msg;
	}
}
