package abstractFactory;

public class AbstractFactoryPatternDemo {
public static void main(String[] args) {
	//��ȡ��״����
	AbstractFactory shapeFactory=FactoryProducer.getFactory("shape");
	//��ȡ��״ΪCircle�Ķ���
	Shape shape1=shapeFactory.getShape("CIRCLe");
	shape1.draw();
	//��ȡ��״ΪRectangle�Ķ���
	Shape shape2=shapeFactory.getShape("RECTANGLE");
	shape2.draw();
	//��ȡSquare
	Shape shape3=shapeFactory.getShape("SQUARE");
	shape3.draw();
	//��ȡ��ɫ����
	AbstractFactory colorFactory=FactoryProducer.getFactory("color");
	//��ȡ��ɫ�Ķ�������ķ���	
	Color color1=colorFactory.getColor("red");
		color1.fill();
	//��ȡ��ɫ�Ķ�������ķ���
		Color color2=colorFactory.getColor("blue");
		color2.fill();
	//��ȡ��ɫ�Ķ�������ķ���
		Color color3=colorFactory.getColor("green");
		color3.fill();
	}
}
