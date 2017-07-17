abstract class Shape
{
	abstract void draw();
}

class Circle extends Shape
{
	void draw()
	{
		System.out.println("Circle");
	}
}

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Rectangle");
	}
}

class Test
{
	public static void main(String [] ar)
	{
		String s1 = "Rectangle";
		Shape s2 = Test.getShape(s1);
		s2.draw();
		
		Shape s3 = Test.getShape("Circle");
		s3.draw();
	}
	
	
	static Shape getShape(String s)
	{
		if(s.equals("Circle"))
			return new Circle();
		else
			if(s.equals("Rectangle"))
				return new Rectangle();
			else
				return null;
	}
	
	
	
}