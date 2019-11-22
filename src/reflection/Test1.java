package reflection;

/**
 * 字节码对象获取实验1
 * Created By Lu Chuan On 2019/11/22
 */
public class Test1 {
	public static void main(String[] args) throws Exception {
		//1.获取字节码对象
		//1.1 通过全路径名加载类获取
		Class clazz1 = Class.forName("reflection.TestClass");
		//1.2 通过.class获取(其实和第一种方法一样，都是先找到这个类文件，然后加载获取字节码对象)
		Class clazz2 = TestClass.class;
		//1.3 通过实例化对象获取
		TestClass testClass = new TestClass();
		Class clazz3 = testClass.getClass();
		// 查看3个字节码对象是否是同一个
		System.out.println("clazz1:"+clazz1);
		System.out.println("clazz2:"+clazz2);
		System.out.println("clazz3:"+clazz3);
		System.out.println(clazz1==clazz2 && clazz1==clazz3);//true
	}
}
