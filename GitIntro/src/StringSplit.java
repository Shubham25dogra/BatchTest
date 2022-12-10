
public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Investing Fixed Income";
		String[] SplittedString = s.split(" ");
		System.out.println(SplittedString[0]);
		System.out.println(SplittedString[1]);
		System.out.println(SplittedString[2]);
		
		// When we Put any Name from given Article then its split in one less than previous Splitted String
		// If There no space between double Court i.e; ("") then it give result Character Wise of Article
		
		String[] SplittedString1 = s.split("Fixed");
		System.out.println(SplittedString1[0]);
		System.out.println(SplittedString1[1]);
		
		// Now on result we see space over Income To Remove we can use trim method
		
		String[] SplittedString2 = s.split("Fixed");
		System.out.println(SplittedString2[0]);
		System.out.println(SplittedString2[1].trim());
		
		//using loop and taking one by one character from Article Which we written over
		for(int i=0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
		
		// for giving command of reverse character use i--
		
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
		}

	}

}
