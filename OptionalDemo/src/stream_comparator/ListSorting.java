package stream_comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ListSorting {

	public static void main(String args[])
	{
		Consumer<String> show=name->{ System.out.println(name); };
		
		
		List<String> names=new ArrayList<String>();
		names.add("delhi");
		names.add("banglore");
		names.add("mumbai");
		names.add("noida");
		System.out.println("natural order");
		names.stream().sorted(Comparator.naturalOrder()).forEach(show);
	    System.out.println("reverse order");
		names.stream().sorted(Comparator.reverseOrder()).forEach(show);
	
	
	}
}
