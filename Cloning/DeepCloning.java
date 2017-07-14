class Course
{
	int cid;
	public Course(int cid)
	{
		this.cid = cid;
	}
}
class Student implements Cloneable
{
	Course course;
	String name;
	int rollno;
	
	public Student(Course course , String name , int rollno)
	{
		this.course = course;
		this.name = name;
		this.rollno = rollno;
	}
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

class Test
{
	public static void main(String [] a) throws CloneNotSupportedException
	{
		Course c = new Course(100);
		Student s  = new Student(c,"hari",200);
		Student s1 = (Student)s.clone();
		System.out.println(s1.name);
		System.out.println(s1.rollno);
		System.out.println(s1.course.cid);
	}
}