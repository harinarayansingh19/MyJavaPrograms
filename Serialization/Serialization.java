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
		FileOutputStream fout = new FileOutputStream("a.txt");
		ObjectOutputStream o = new ObjectOutputStream(fout);
		Student s = new Student(100,"hari");
		o.writeObject(s);
	}
}

