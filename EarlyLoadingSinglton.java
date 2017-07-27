class Student
{
	static Student s = new Student();
	private Student()
	{
		
	}
	public static Student getStudent()			// early loading means object wil be created before exacution bcoz it is sta
	{
		return s;
	}
}
class Test
{
	public static void main(String [] args)
	{
		Student s1 = Student.getStudent();						// its like RunTime class, we call methods of RunTime class name	
		Student s2 = Student.getStudent();
		
		
		// to check both objects r equal
		// check via equals() or hashCode()
		
		if(s1.equals(s2))
		{
			System.out.println("equal");
		}
	}
}