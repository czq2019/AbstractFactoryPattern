package abstractFactory;

public class AbstractFactoryPatternDemo {
public static void main(String[] args) {
	//获取形状工厂
	AbstractFactory shapeFactory=FactoryProducer.getFactory("shape");
	//获取形状为Circle的对象
	Shape shape1=shapeFactory.getShape("CIRCLe");
	shape1.draw();
	//获取形状为Rectangle的对象
	Shape shape2=shapeFactory.getShape("RECTANGLE");
	shape2.draw();
	//获取Square
	Shape shape3=shapeFactory.getShape("SQUARE");
	shape3.draw();
	//获取颜色工厂
	AbstractFactory colorFactory=FactoryProducer.getFactory("color");
	//获取红色的对象和它的方法	
	Color color1=colorFactory.getColor("red");
		color1.fill();
	//获取蓝色的对象和它的方法
		Color color2=colorFactory.getColor("blue");
		color2.fill();
	//获取绿色的对象和它的方法
		Color color3=colorFactory.getColor("green");
		color3.fill();
	}
}
