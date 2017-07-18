import java.io.*;
import java.util.*;

class Student implements Serializable
{
	int roll;
	String name;
	public Student(int roll, String name)
	{
		this.roll = roll;;
		this.name =name;
	}
}


class Test
{
	public static void main(String [] asr) throws Exception
	{
		
		/*
		FileOutputStream fout = new FileOutputStream("a2.txt");
		ObjectOutputStream o = new ObjectOutputStream(fout);
		Student s1 = new Student(101,"hari");
		Student s2 = new Student(102,"harsh");
		Student s3 = new Student(103,"aman");
		Student s4 = new Student(104,"ram");
		Student s5 = new Student(105,"mohan");
		
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		o.writeObject(list);
		*/
		
		ObjectInputStream o = new ObjectInputStream(new FileInputStream("a2.txt"));
		
		List<Student> list = (List<Student>)o.readObject();
		
		for (Student student : list) 
		{
			System.out.println(student.roll+"  "+student.name);	
		}		
	}
}	
		