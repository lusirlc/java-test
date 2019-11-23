package extend;

/**
 * Created By Lu Chuan On 2019/11/23
 */
public class Test {
	public static void main(String[] args) {
		Father father = new Son();
		Son son = new Son();
		father.eat();//调用的父类自己的方法，因为子类并没有重写
		son.eat();//尽管子类没有这个方法，但是父类有，就会用父类的方法
		father.method();//调用的是子类的方法，因为子类重写了这个方法
		// 结论：父类只能用自己的方法，尽管实例化的对象是子类，但是用不了子类独有的方法，除非子类将父类有的方法重写了
	}
}
