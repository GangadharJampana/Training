package demo;

class Student{
	int rollno;
	String name;
	void Student(int r,String N){
		rollno=r;
		name=N;
	}
	
}
class Gangadhar extends Student{
	String Address;
	
	
}
class InheritanceTest{
	public static void main(String[] arg){
		Gangadhar ganga = new Gangadhar();
		ganga.Student(4, "ganga");
		System.out.println(ganga.rollno);
		System.out.println(ganga.name);
		
		Student student = ganga;
		
		System.out.println(student.name);
		System.out.println(student.rollno);
	}
	
}
