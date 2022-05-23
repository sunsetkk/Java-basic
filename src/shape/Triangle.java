package shape;

public class Triangle extends Shape{
	
	public Triangle(int lineCnt, double width, double height) {
		super(lineCnt, width, height);
	}

	@Override
	double getArea() {
		area = width*height/2;
		return area;
	}
	
}
