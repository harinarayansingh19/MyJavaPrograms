import java.lang.reflect.*;
class Student								// to know all abiut the class
{
	int a;
	private int b = 90;
	void show()
	{
		System.out.println("hello");
	}
}
class Test 
{
	public static void main(String [] a) throws Exception
	{
		
		Class cls = Student.class;
		Method [] m = cls.getDeclaredMethods();
		for(int i=0;i<m.length;i++)
		{
			System.out.println(m[i]);
		}
		
		Field[] f = cls.getDeclaredFields();
		for(int i=0;i<f.length;i++)
		{
			//System.out.println(f[i].getName());
			f[i].setAccessible(true);
			System.out.println(f[i].get(new Student()));
		}
		
		
	}
}