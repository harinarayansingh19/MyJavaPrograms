class Person
{
	void show()
	{
		String pName;
	    System.out.println("its person class method");
	}
	
}
class Employee extends Person
{
	void show1()
	{
		int e_Id;
		System.out.println("its employee class");
	}
	
}
class Teacher extends Employee
{
	void show2()
	{
		int t_id;
		System.out.println("its teacher class");
	}
	
}

class Test
{
	public static void main(String [] ar)
	{
		Teacher t = new Teacher();
		t.show();
	}
}