class Emp{
	//System.out.println("Hello Employee");//error
	String name;//Data Member or Variable or Fields or State
	int salary=90000;//Data Member
	String cname;//Data Member
	//cname="INCAPP";//error
	void changeCname() {
		cname="INCAPP";
	}
	void show() { //Member Function or Methods or Behaviour
		System.out.println(name+" "+salary+" "+cname);
	}
	void input(String n,int s,String c) { //Member Function or Methods
		name=n;
		salary=s;
		cname=c;
	}
}
public class ClassObjectEx2 {
	public static void main(String[] args) {
		Emp a=new Emp();
		Emp b=new Emp();
		Emp c=new Emp();
		Emp d=new Emp();
		
		a.show();
		b.show();
		c.show();
		d.show();
	
		a.input("Yoyo Gupta", 78000, "ABC");
		b.input("Cheetah Khan", 200000, "XYZ");
		c.input("Kaliya Sharma", 450000, "PQR");
		d.input("Gogo Singh", 98000, "MNO");
		
		b.changeCname();
		c.changeCname();
		
		a.show();
		b.show();
		c.show();
		d.show();
		
		int total=a.salary+b.salary+c.salary+d.salary;
		System.out.println("Total Salary: "+total);
	}
}