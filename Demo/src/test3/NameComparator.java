package test3;

import java.util.Comparator;

public class NameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Author s1=(Author) o1;
		Author s2=(Author) o2;
		return s1.name.compareTo(s2.name);
	}
}
