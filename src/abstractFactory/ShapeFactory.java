package abstractFactory;


public class ShapeFactory extends AbstractFactory{

	

	@Override
	public Shape getShape(String shape) {
		if(shape==null) {
			return null;
		}
		if(shape.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}else if(shape.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}else if(shape.equalsIgnoreCase("square")){
			return new Square();
		}
		return null;
	}
	@Override
	public Color getColor(String Color) {
		return null;
	}
	
}
