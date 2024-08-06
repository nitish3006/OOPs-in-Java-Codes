
public class WrapperClassEx {

	public static void main(String[] args) {
		Integer a=new Integer(3); //Boxing
		System.out.println(a);
		int aa=a.intValue();//Unboxing
		System.out.println(aa);
		Integer b=3;//Auto Boxing
		System.out.println(b);
		int bb=b;//Auto Unboxing
		System.out.println(bb);
		
		double x=10;
//		Double x=10;//error
		System.out.println(x);
	}

}
