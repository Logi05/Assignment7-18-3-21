package test3;

import java.util.Comparator;

public class AgeComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Author S1=(Author) o1;
		Author S2=(Author) o2;
		
		if(S1.age==S2.age)
		{
			return 0;
		}
		else if(S1.age>S2.age)
		{
			return 1;
		}
		else
			return -1;
	}

}
