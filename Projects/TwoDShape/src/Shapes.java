class TwoDShape{
	double width;
	double height;
	void show_dimension(){
		System.out.println("Width and Height are " + width 
				+ " and " + height);
	}
}

class Triangle extends TwoDShape{
	
	private String style;
	
	Triangle(String s, double w, double h){
		width = w;
		style = s;
		height = h;
	}
	
	double area(){
		return width * height /2;
	}
	
	void showStyle(){
		System.out.print("Triangle is " + style);
	}
}

class Rectangle extends TwoDShape{
	double area(){
		return width * height;
	}
}

public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle tr = new Triangle("isosceles",4.0,4.0);
		Rectangle rect = new Rectangle();
		
		tr.width = 4.0;
		tr.height = 4.0;
		
		rect.width = 8.0;
		rect.height = 12.0;
		
		System.out.println("Info for trianlge: ");
		tr.show_dimension();
		System.out.println("Area is " + tr.area());
		
		System.out.println("Info for Rectangle is: ");
		rect.show_dimension();
		System.out.println("Area is: " + rect.area());

	}

}
