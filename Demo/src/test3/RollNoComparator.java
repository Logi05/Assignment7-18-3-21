package test3;

import java.util.Comparator;

public class RollNoComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Author a1=(Author) o1;
		Author a2=(Author) o2;
	
		if(a1.rollNo==a2.rollNo)
		{
			return 0;
		}
		else if(a1.rollNo>a2.rollNo)
		{
			return 1;
		}
		else
			return -1;
	}

}
