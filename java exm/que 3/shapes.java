class shape
{	
	@Override
	void draw();
	{
		System.out.println("Shape draw()");
	}
	@Override
	void erase()
	{
	System.out.println("Shape erase()");
	}
	
}
class Circle extends shape
{	
	@Override
	void draw()
	{
		System.out.println("Circle draw()");
	}
	@Override
	void erase()
	{
		System.out.println("Circle erase()");
	}
}
class Triangle extends shape
{
	@Override
	void draw()
	{
		System.out.println("Triangle draw()");
	}
	@Override
	void erase()
	{
		System.out.println("Triangle erase()");
	}
}
class Square extends shape
{	
	@Override
	void draw()
	{
		System.out.println("Square draw()");
		
	}
	@Override
	void erase()
	{
		System.out.println("Square erase()");
	}	
}
public class Shapes
{
	public static void main (String [] args)
	{
		shape c = new Circle();
		shape t = new Triangle();
		shape s = new Square();
		c.draw(); c.erase();
		t.draw(); t.erase();
		s.draw(); s.erase();
		
		
	}
}