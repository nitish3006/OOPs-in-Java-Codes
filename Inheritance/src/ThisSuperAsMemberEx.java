class X {  
	int a=10;
	void print() {
		System.out.println("Hello X");
	}
}
class Y extends X{
	int b=20;
	int a=45;
	void m() {
		int c=30;
		int a=70;
		System.out.println(a);//70
		System.out.println(this.a);//45
		System.out.println(super.a);//10
		System.out.println(b);//20
		System.out.println(c);//30
		print();//Hello Y
		this.print();//Hello Y
		super.print();//Hello X
	}
	void print() {
		System.out.println("Hello Y");
		//System.out.println(c);//error
	}
}
public class ThisSuperAsMemberEx {
	public static void main(String[] args) {
		Y y=new Y();
		System.out.println(y.a);//45
		//System.out.println(y.super.a);//error
		y.print();//Hello Y
		y.m();
		
		X x=new X();
		System.out.println(x.a);//10
		x.print();//Hello X
	}
}
