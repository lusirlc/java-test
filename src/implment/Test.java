package implment;

/**
 * Created By Lu Chuan On 2019/11/23
 */
public class Test {
	public static void main(String[] args) {
		Father father = new Son();
		father.eat();////调用的是子类的方法，因为子类重写了这个方法
		father.method();//调用的是子类的方法，因为子类重写了这个方法
		father.method1();//调用的是父类的默认方法，前提是子类没有重写这个方法
		/**
		 * 继承的方式和接口实现方式的区别
		 * 1.继承可以重写部分方法，但接口实现必须重写全部方法
		 * 2.接口可以有默认方法，子类可以重写默认方法
		 * 3.接口只提供想法，不提供做法，但是可以使用别人实现了想法的做法
		 * 继承提供想法也提供做法，子类继承了也相当有了这个方法，可以重写也可以不重写
		 * ，如果重写后父类调用这个方法则将是子类重写后的方法
		 */
	}
}
