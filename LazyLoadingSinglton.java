class Student
{
	static Student s;
	private Student()
	{
		
	}
	public static Student getStudent()			// lazy loading means when the method is called object will be created
	{
		return new Student();
	}
}
class Test
{
	public static void main(String [] args)
	{
		Student s1 = Student.getStudent();							
		Student s2 = Student.getStudent();
		
		
		// to check both objects r equal
		// check via equals() or hashCode()
		
		if(s1.equals(s2))
			System.out.println("true");
	}
}