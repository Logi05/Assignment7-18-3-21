package test3;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorTest {
		public static void main(String args[]) {
			ArrayList<Author> list1=new ArrayList<Author>();
			list1.add(new Author(20,5,"Priya"));
			list1.add(new Author(18,2,"Gayathri"));
			list1.add(new Author(21,9,"Ram"));
			list1.add(new Author(22,6,"Logi"));
			
			System.out.println("Sorting by Name");
			
			Collections.sort(list1, new NameComparator());
			for(Author s:list1)
			{
				System.out.println(s.rollNo+" "+s.age+" "+s.name);
			}
			System.out.println();
			System.out.println("Sorting by Age");
			Collections.sort(list1,new AgeComparator());
			for(Author ss:list1)
			{
				System.out.println(ss.rollNo+" "+ss.age+" "+ss.name);
			}
			System.out.println();
			System.out.println("Sorting by RollNo");
			Collections.sort(list1,new RollNoComparator());
			for(Author r:list1)
			{
				System.out.println(r.rollNo+" "+r.age+" "+r.name);
			}
		}	
}
