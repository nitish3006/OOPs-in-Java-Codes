public class ClassObjectEx1 {
	public static void main(String[] args) {
		Employee a=new Employee();
		Employee b=new Employee();
		Employee c=new Employee();
		Employee d=new Employee();
		
		
		
		//System.out.println(name);//error
		
		System.out.println(a.name+" "+a.salary+" "+a.cname);
		System.out.println(b.name+" "+b.salary+" "+b.cname);
		System.out.println(c.name+" "+c.salary+" "+c.cname);
		System.out.println(d.name+" "+d.salary+" "+d.cname);
		
		a.name="Yoyo Gupta";
		a.salary=4500000;
		a.cname="ABC";
		b.name="Cheetah Khan";
		b.salary=2000000;
		b.cname="XYZ";
		c.name="Kaliya Sharma";
		c.salary=450000;
		c.cname="PQR";
		d.name="Gogo Singh";
		d.salary=850000;
		d.cname="MNO";

		System.out.println(a.name+" "+a.salary+" "+a.cname);
		System.out.println(b.name+" "+b.salary+" "+b.cname);
		System.out.println(c.name+" "+c.salary+" "+c.cname);
		System.out.println(d.name+" "+d.salary+" "+d.cname);
		
		int total=a.salary+b.salary+c.salary+d.salary;
		System.out.println("Total Salary: "+total);
	}
}

class Employee{
	String name;
	int salary;
	String cname;
	
}