class X{
	final private void m1() {
		System.out.println("Hi X");
	}
	void m() {
		m1();
	}
}
class Y extends X{
	void m1() {
		System.out.println("Hi Y");
	}
}
public class FinalPrivateMethodEx {
	public static void main(String[] args) {
		Y y=new Y();
		y.m1();
		y.m();
	}
}