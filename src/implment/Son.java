package implment;

/**
 * Created By Lu Chuan On 2019/11/23
 */
public class Son implements Father {
	
	public void method(){
		System.out.println("I am son method");
	}
	
	@Override
	public void eat() {
		System.out.println("I am son eat method");
	}
	
	public void run(){
		System.out.println("I am son run method");
	}
	
	@Override
	public void method1() {
		System.out.println("I am son method1");
	}
}
