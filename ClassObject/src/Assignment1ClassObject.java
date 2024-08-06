class Student{
	String name;
	String FatherName;
	int Fee;
    String SchoolName;
    void input() {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter Student's Details:");
		System.out.println("Name: ");
		name=sc.next();
		System.out.println("Father's Name: ");
		FatherName=sc.next();
		System.out.println("Fee: ");
		Fee=sc.nextInt();
		System.out.println("School Name: ");
		SchoolName=sc.next();
		
	}
    void show(){
		System.out.println("Name: "+name+"\n"+"Father's Name: "+FatherName+"\n"+"Fee:"+Fee+"\n"+"School Name: "+SchoolName);
	}
	
	
}
public class Assignment1ClassObject {

	public static void main(String[] args) {

		Student a = new Student();
//		Student b = new Student();
//		Student c = new Student();
//		Student d = new Student();
//		Student e = new Student();
//		
		a.input();
//		b.input();
//		c.input();
//		d.input();
//		e.input();
//		
		a.show();
//		b.show();
//		c.show();
//		d.show();
//		e.show();
//			
		
	}

}