import java.util.*;

public class CollectionsEx1 {

	public static void main(String[] args) {
		HashSet a=new HashSet();
		//ArrayList a=new ArrayList();
		
		a.add("ram");
		a.add(12);
		a.add(12);
		a.add(3.2);
		System.out.println(a);
		//System.out.println(a.get(0));
		for(Object o:a) {
			System.out.println(o);
		}
	}

}
