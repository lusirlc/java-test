import java.util.Collections;
import java.util.List;

/**
 * Created By Lu Chuan On 2019/11/22
 */
public class ForTest {
	public static void main(String[] args) {
		List<String> list = Collections.EMPTY_LIST;
		for (String s : list) {//为空不会走for循环里面
			System.out.println(s.length());
		}
	}
	
}
