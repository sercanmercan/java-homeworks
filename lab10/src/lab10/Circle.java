package lab10;

public class Circle extends GeometricObject{
	final double PI=3.14;
	 private double radius;
	
	 double diameter;
	Circle(double radius){
		this.radius=radius;
		diameter=2*radius;
	}
	
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		
		return PI*radius*radius;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*PI*radius;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "radius :"+ radius+ "  area : " + getArea()+ "  Perimeter : " + getPerimeter();
	}
	
	double getRadius() {
		return radius;
		
	}
	void setRadius(double radius) {
		this.radius=radius;
	}
	
	double getDiameter() {
		return diameter;
		
	}
}
