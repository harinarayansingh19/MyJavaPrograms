import java.io.*;

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
		// to write multiple object in a file
		/*
		
		FileOutputStream fout = new FileOutputStream("a1.txt");
		ObjectOutputStream o = new ObjectOutputStream(fout);
		Student s1 = new Student(101,"hari");
		Student s2 = new Student(102,"harsh");
		Student s3 = new Student(103,"aman");
		Student s4 = new Student(104,"ram");
		Student s5 = new Student(105,"mohan");
		
		o.writeObject(s1);
		o.writeObject(s2);
		o.writeObject(s3);
		o.writeObject(s4);
		o.writeObject(s5);
		
		*/
		
		// reading multiple object in a SAME (which has that written data) file
		
		FileInputStream fin = new FileInputStream("a1.txt");
		ObjectInputStream o = new ObjectInputStream(fin);
		
		Student s1 = (Student)o.readObject();
		Student s2 = (Student)o.readObject();
		Student s3 = (Student)o.readObject();
		Student s4 = (Student)o.readObject();
		Student s5 = (Student)o.readObject();
		
		
		System.out.println(s1.roll+"  "+s1.name);
		System.out.println(s2.roll+"  "+s2.name);
		System.out.println(s3.roll+"  "+s3.name);
		System.out.println(s4.roll+"  "+s4.name);
		System.out.println(s5.roll+"  "+s5.name);
	}
}

