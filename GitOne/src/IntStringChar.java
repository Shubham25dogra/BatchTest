
public class IntStringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 3;
		String B ="Multimedia Optical Drive";
		char C = 'Z';
		double D = 2.5;
		boolean E = true;
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
		System.out.println(E);
		
		int[] array = new int[3];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		array[5] = 6;
		
		System.out.println(array[1]);
		System.out.println(array[3]);
		System.out.println(array[5]);
		
		int[] Array = {3,6,9,12,15,18,21,24,27,30};
		System.out.println(Array[5]);
		
		for(int i=0; i< Array.length; i++)
		{
			System.out.println(Array[i]);
		}
		for(int i=0; i< Array.length; i++)
		{
			if(Array[i] % 4==0)
			{
				System.out.println(Array[i]);
				break;
			}
			else
			{
				System.out.println(Array[i]+"  Not Divisible by 4");
			}
		}
		
		String[] NAME = {"Shubham","Shweta","Anjali","Arpit"};
		
		for(int x=0; x< NAME.length; x++)
		{
			System.out.println(NAME[x]);
		}
		
		char[] Alphabet = {'A','B','C','D'};
		
		for(char a=0; a< Alphabet.length; a++)
		{
			System.out.println(Alphabet[a]);
		}
		
		double[] Decimal = {12.75,13.5,14.22,15.8};
		
		for(int c=0; c< Decimal.length; c++)
		{
			if(Decimal[c] % 0.25==0)
			{
				System.out.println(Decimal[c]);
			}
			else
			{
				System.out.println(Decimal[c]+" Not multiple of 5");
			}
		}

	}

}
