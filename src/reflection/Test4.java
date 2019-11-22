package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * 获取构造方法
 * 使用构造方法创建对象
 * Created By Lu Chuan On 2019/11/22
 */
public class Test4 {
	public static void main(String[] args) throws Exception {
		Class<TestClass> clazz = TestClass.class;
		Constructor<?>[] constructors = clazz.getConstructors();
		for (Constructor<?> constructor : constructors) {
			System.out.println(constructor);
		}
		Constructor<TestClass> constructor = clazz.getConstructor(int.class, String.class);
		TestClass o = constructor.newInstance(1, "ha");
		System.out.println(o);
	}
}
