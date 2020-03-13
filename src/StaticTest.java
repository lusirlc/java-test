/**
 * Created By Lu Chuan On 2019/12/4
 */
public class StaticTest {
	int a;
	public static void main(String[] args) {
//		a=1; // 报错，静态方法不能访问非静态成员变量
		int a = 1;
		a=2;// 静态方法中可以访问局部变量
	}
}