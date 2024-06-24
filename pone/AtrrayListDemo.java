package pone;

import java.util.ArrayList;
import java.util.List;

public class AtrrayListDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add('a');
		list.add(2.12);
		list.add("java");
		System.out.println(list);
		list.add(true);
		list.add(1,2);
		
		System.out.println(list);
		list.set(2, 20);
		System.out.println(list);
		list.add(30);
		list.add(20);
		System.out.println(list);
		
		System.out.println(list.indexOf('a'));
		
		System.out.println(list.contains(1));
		
		System.out.println(list.get(0));
		
		System.out.println(list.lastIndexOf(20));
		
		System.out.println(list.size());
		System.out.println(list.remove(9));
		System.out.println(list);
		
		System.out.println(list.remove(2));
		System.out.println(list.remove("java"));
		System.out.println(list);
		
		System.out.println(list.isEmpty());
		
		List l=new ArrayList();
		System.out.println(l.isEmpty());
		
		l.add(1);
		l.add(2);
		l.add(3);
		System.out.println(l.toArray());
		
		
		
		
		/*List arrlist=new ArrayList<Integer>();
		arrlist.addAll(list);
		
		System.out.println(arrlist);
		
		arrlist.add('b');
		
		System.out.println(arrlist);*/
		
		
	}

}
