/**
 * Created By Lu Chuan On 2019/12/4
 */
public class FinalTest {
	public static void main(String[] args) {
		final int finalNum = 1;
		final Integer finalInt=2;
		int a = 0;
		a = finalNum; // 其他值可以指向final值
//		finalNum = 1; //报错，final不可更改
		Integer b = null;
		b = finalInt; //别的变量可以指向final变量
//		finalInt = b; // 报错，final变量不可指向其他变量
	}
}
