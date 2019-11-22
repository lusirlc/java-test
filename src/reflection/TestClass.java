package reflection;

/**
 * Created By Lu Chuan On 2019/11/22
 */
public class TestClass {
	private int intField;
	private String strField;
	
	public TestClass() {
	}
	
	public TestClass(int intField, String strField) {
		this.intField = intField;
		this.strField = strField;
	}
	
	private void method1() {
		System.out.println("I am method1");
	}
	public void method2(String strParam){
		System.out.println("I am method2,param:"+strParam);
	}
	
	@Override
	public String toString() {
		return "TestClass{" +
				"intField=" + intField +
				", strField='" + strField + '\'' +
				'}';
	}
}
