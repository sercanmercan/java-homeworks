package lab10;

public class Rectangle extends GeometricObject{

	private double height;
	private double width;
	Rectangle(double width, double height){
		this.height=height;
		this.width=width;
	}
	
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(height+width);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Width :"+ width+ "  height : "+ height+ "   Area: " +getArea()+ "  Perimeter : "+ getPerimeter() ;
	}
	
	public void setHeight(double height) {
		this.height=height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setWidth(double height) {
		this.width=width;
	}
	
	public double getWidth() {
		return width;
	}

}
