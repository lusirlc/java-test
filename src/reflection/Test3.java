package reflection;

import java.lang.reflect.Field;

/**
 * 获取字段
 * 给字段设置值
 * 获取字段值
 * Created By Lu Chuan On 2019/11/22
 */
public class Test3 {
	public static void main(String[] args) throws Exception {
		Class<TestClass> clazz = TestClass.class;
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		Field intField = clazz.getDeclaredField("intField");
		intField.setAccessible(true);
		TestClass obj = new TestClass();
		intField.set(obj,1);
		Object o = intField.get(obj);
		System.out.println(o);
		
	}
}
