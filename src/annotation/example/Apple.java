package annotation.example;

import annotation.FruitColor;
import annotation.FruitName;
import annotation.FruitProvider;
import annotation.handler.FruitInfoHandler;

/**
 * 水果注解的使用
 * Created By Lu Chuan On 2019/11/22
 */
public class Apple {
	@FruitName("Apple")
	private String name;
	@FruitColor(fruitColor = FruitColor.Color.GREEN)
	private String color;
	@FruitProvider(id = 1,name = "陕西红富士集团",address = "陕西省西安市延安路89号红富士大厦")
	private String provider;
	
	public static void main(String[] args) {
		FruitInfoHandler.getFruitInfo(Apple.class);
	}
}
