package pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MianClass 
{
	public static void main(String[] args)
	{
		List<String> countries = new ArrayList<String>();
		countries.add("India");
		countries.add("USA");
		countries.add("Isrel");
		countries.add("Italy");
		countries.add("Windes");
		countries.add("India");
		countries.add("Isrel");
		countries.add("Germany");
		countries.add("Newzeland");
		

		//Distinct Operations Getting only Unique Values in stream
		
		/*
		 * countries.stream() .distinct() .forEach(System.out::println);
		 */
		
		
		//Limit operation Getting only the specified number of elements in stream
		/*
		 * countries.stream() .limit(4) .forEach((i) -> System.out.println(i));
		 */
		
		//Skip operation Skiping the specified number of elements from starting in stream
		
		countries.stream()
		.skip(2)
		.forEach(System.out::println);
		
	}

}
