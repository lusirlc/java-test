package reflection;

import java.lang.reflect.Method;

/**
 * 获取方法
 * 执行方法
 * Created By Lu Chuan On 2019/11/22
 */
public class Test6 {
	public static void main(String[] args) throws Exception {
		Class<TestClass> clazz = TestClass.class;
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		System.out.println("----------------------");
		Method[] declaredMethods = clazz.getDeclaredMethods();
		for (Method declaredMethod : declaredMethods) {
			System.out.println(declaredMethod);
		}
		TestClass o = new TestClass();
		
		Method method1 = clazz.getDeclaredMethod("method1");
		method1.setAccessible(true);
		method1.invoke(o);
		
		Method method2 = clazz.getDeclaredMethod("method2", String.class);
		method2.invoke(o,"ha");
		
	}
}
