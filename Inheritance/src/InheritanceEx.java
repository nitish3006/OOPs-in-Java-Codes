class A {
	int x=10;
	static int h=10;
	private int z=50;
	void showZ() {
		System.out.println(z);
	}
	void m1() {
		System.out.println("Hello A");
	}
}
class B extends A{
	int y=20;
	void m2() {
		System.out.println("Hello B");
		System.out.println(y);
		System.out.println(x);
		System.out.println(h);
		//System.out.println(z);//error
		showZ();
	}
}
public class InheritanceEx {
	public static void main(String[] args) {
		A a=new A();
		a.x=15;
		a.h=15;
		System.out.println(a.x);
		System.out.println(a.h);
		//System.out.println(a.z);//error
		a.showZ();
		a.m1();
		B b=new B();
		System.out.println(b.x);
		System.out.println(b.h);
		//System.out.println(b.z);//error
		b.showZ();
		System.out.println(b.y);
		b.m1();
		b.m2();
	}
}
