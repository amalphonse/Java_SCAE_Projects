class TwoDShapes{
	private double width;
	private double height;
	public String name;
	
	double getWidth(){
		return width;
	}
	
	double getHeight(){
		return height;
	}
	
	void setWidth(double w){ width = w; }
	
	void setHeight(double h){ height = h;}
	
	void show_dimension(){
		System.out.println("Width: " + width + "Height:" +height);
				
	}
	
	double area(){
		System.out.println("area() must be overrideen.");
		return 0.0;
	}
}

class Triangle extends TwoDShapes{
	double area(){
		return getWidth() * getHeight() /2;
	}
}

class Rectangle extends TwoDShapes{
	boolean isSquare(){
		if(getWidth() == getHeight()) return true;
		return false;
	}
	double area(){
		return getWidth() * getHeight();
	}
}
public class DynShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoDShapes shapes[] = new TwoDShapes[2];
		shapes[0] = new Triangle();
		shapes[0].setWidth(8.0);
		shapes[0].setHeight(12.0);
		shapes[0].name = "Triangle";
		
		shapes[1] = new Rectangle();
		shapes[1].setWidth(10.0);
		shapes[1].setHeight(4.0);
		shapes[1].name = "Rectangle";
		
		for(int i=0; i < shapes.length;i++){
			System.out.println("Object is " +shapes[i].name);
			System.out.println("Area is " +shapes[i].area());
		}

	}

}
