package extend;

/**
 * Created By Lu Chuan On 2019/11/23
 */
public class Son extends Father {
	private int code;
	private String msg;
	
	@Override
	public int getCode() {
		return code;
	}
	
	@Override
	public void setCode(int code) {
		this.code = code;
	}
	
	@Override
	public String getMsg() {
		return msg;
	}
	
	@Override
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void method(){
		System.out.println("I am son method");
	}
	public void run(){
		System.out.println("I am son run method");
	}
}
