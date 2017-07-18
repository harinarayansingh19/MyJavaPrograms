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
		/*FileOutputStream fout = new FileOutputStream("a.txt");
		ObjectOutputStream o = new ObjectOutputStream(fout);
		Student s = new Student(100,"hari");
		o.writeObject(s);*/
		
		ObjectInputStream fin = new ObjectInputStream(new FileInputStream("a.txt"));
		Student s1 = (Student)fin.readObject();
		Student s2 = (Student)fin.readObject();				//we have created one object but we r reading 2nd object so at 1st object file has 
															//ended so it give EndOfFile exception
	}
}

