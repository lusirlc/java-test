package implment;

/**
 * Created By Lu Chuan On 2019/11/23
 */
public interface Father {
	
	public void method();
	public void eat();
	default void method1() {
		System.out.println("I am default method");
	}
}
