package exception.test;

/**
 * Created By Lu Chuan On 2019/11/22
 */
public class Exception1 extends Exception {
	private int code;
	
	public Exception1(String message, int code) {
		super(message);
		this.code = code;
	}
}
