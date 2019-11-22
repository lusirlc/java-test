package reflection;

import java.lang.reflect.Constructor;

/**
 * 使用字节码对象创建对象
 * Created By Lu Chuan On 2019/11/22
 */
public class Test5 {
	public static void main(String[] args) throws Exception {
		Class<TestClass> clazz = TestClass.class;
		TestClass testClass = clazz.newInstance();
		System.out.println(testClass);
	}
}
