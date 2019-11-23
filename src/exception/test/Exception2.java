package exception.test;

/**
 * Created By Lu Chuan On 2019/11/22
 */
public class Exception2 extends RuntimeException {
	private int code;
	
	public Exception2(String message, int code) {
		super(message);
		this.code = code;
	}
}
