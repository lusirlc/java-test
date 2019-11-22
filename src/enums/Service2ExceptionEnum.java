package enums;

/**
 * Created By Lu Chuan On 2019/11/7
 */
public enum Service2ExceptionEnum {
	TIP1(2001,"错误提示1"),
	TIP2(2002,"错误提示2"),
	TIP3(2003,"错误提示3"),
	TIP4(2004,"错误提示4"),
	;
	
	private int code;
	private String msg;
	
	Service2ExceptionEnum(int code, String msg) {
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
