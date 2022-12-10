import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class ArrayListAndStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<String> names = new ArrayList<String>();
//	     names.add("Baijnath");
//	     names.add("Paprola");
//	     names.add("Averi");
//	     names.add("Tinbar");
//	     names.add("Lambangaon");
//	     names.add("Kathala");
		
		String[] names = {"Baijnath", "Paprola", "Test"};
		
	     int z=0;
	     
	     for(int i=0; i<names.length; i++)
	     {
	    	 String Letter = names[i];
	    	 if(Letter.startsWith("B"))
	    	 {
	    		 z++;
	    	 }
	     }
	     
	     System.out.println(z);
	    
		ArrayList<String> Names = new ArrayList<String>();
		
		Names.add("Baijnath");
	    Names.add("Kerela");
	    Names.add("Averi");
	    Names.add("Tinbar");
	    Names.add("Lambangaon");
	    Names.add("Kathala");
	    
	    // Here we show 'Stream Method' With which it work only in single line And it whole Data Parallel.
	    // Here we Work without 'for' Loop Concept and if concept.
	    
	    long L = Names.stream().filter(s->s.startsWith("K")).count();
	    System.out.println(L);
	    
	    Stream.of("Sheetal","Shubham","Sarvesh","Abhishek","Abhijeet","Ramesh","Vinod").filter(s->s.startsWith("A")).count();
	    // Stream operation also work with above Data which completed in one line.
	    // Here No need of ArrayList related Data.
	    // This Terminal operation will execute when internal operation related to filter return True.
	    long A = Stream.of("Sheetal","Shubham","Sarvesh","Abhishek","Abhijeet","Ramesh","Vinod").filter(s->
	    {
	    	s.startsWith("S");
	    	//return false;
	    	return true;
	    }).count();
	    System.out.println(A);
	    // Here Data is printed 0. because internal operation(filter) return False. As we discussed in line 53 that it work only when filter is true.
	    
	    // If we want to Print Names with any subsequent length(as greater than any integer) That we add at ArrayList.
	    Names.stream().filter(s->s.length()>=6).forEach(s->System.out.println(s));
	    Names.stream().filter(s->s.length()>6).limit(1).forEach(s->System.out.println(s));
	    
	   // Now we work in ClassMap
	    // Here we print name which have last Letter end with alphabet 'h' in CapitalLetters.
	    
	    Stream.of("Sheetal","Shubham","Sarvesh","Abhishek","Abhijeet","Ramesh","Vinod").filter(s->s.endsWith("h")).map(s->s.toUpperCase())
	    .forEach(s->System.out.println(s));
	    
	    // Here UpperCase defined As Letter in Capital Alphabet.
	    
	    // Now My Target to identify Names with "Sorted" Category that is I want to Print Name In Alphabatically of certain Alphabet
	    Stream.of("Sheetal","Shubham","Sarvesh","Abhishek","Abhijeet","Ramesh","Vinod").filter(s->s.startsWith("S")).sorted()
	    .map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	    // OR
	    List<String> NAMES = Arrays.asList("Sheetal","Shubham","Sarvesh","Abhishek","Abhijeet","Ramesh","Vinod");
	    NAMES.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	    
	    Stream<String> newStream = Stream.concat(Names.stream(), NAMES.stream());
	    // newStream.forEach(s->System.out.println(s));
	    
	    // Here if we work with command on line 83 then below match work is not taken Place
	    // Because Concat Command allow one command at a time
	    boolean match = newStream.anyMatch(s->s.equalsIgnoreCase("Sarvesh"));
	    System.out.println(match);
	    Assert.assertTrue(match);
	    
	    List<String> Collector = Stream.of("Sheetal","Shubham","Sarvesh","Abhishek","Abhijeet","Ramesh","Vinod")
	    		.filter(s->s.endsWith("h")).map(s->s.toUpperCase()).sorted().collect(Collectors.toList());
	    System.out.println(Collector.get(0));
	    // This Method is used As same that we used by Limit case in line 65
	    
	    List<Integer> values = Arrays.asList(7,5,9,5,3,9,1,2);
	    values.stream().distinct().forEach(s->System.out.println(s));
	    // Here distinct work for unique numbers
	    List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());  // Here list li= 1,2,3,5,7,9
	    System.out.println(li.get(3)); // get(3) is 5
	    
	    

	}

}
