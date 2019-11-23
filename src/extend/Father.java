package extend;

/**
 * Created By Lu Chuan On 2019/11/23
 */
public class Father {
	private int code;
	private String msg;
	private String otherMsg;
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String getOtherMsg() {
		return otherMsg;
	}
	
	public void setOtherMsg(String otherMsg) {
		this.otherMsg = otherMsg;
	}
	
	public void method(){
		System.out.println("I am father method");
	}
	public void eat(){
		System.out.println("I am father eat method");
	}
}
