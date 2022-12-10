
public class CoreJavaBrushUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num = 2;
		String sentence = "Java Course for Beginner";
		char letter = 'S';
		double Dec = 3.75;
		boolean mycard = true;
		
		System.out.println(Num+"is the even number");
		System.out.println(sentence);
		System.out.println(letter);
		System.out.println(Dec);
		System.out.println(mycard);
		
		// Array
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 5;
		arr[4] = 7;
		
		// this new int[5] or int[] arr1 both are valid for one concept
		
		int[] arr1 = {1,2,3,5,7,11,13,17,23};
		//System.out.println(arr1[3]);
		
		// Instead of printing one by one array we can use loop concept(which print all value's that we were given
		// loop arr.length 5
		for(int s:arr1)
		{
			System.out.println(s);
		}
		
		for(int i=0; i< arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
		String[] name = {"Ashish","Shweta","Seena","Devraj"};
		for(int i=0; i< name.length; i++)
		{
            System.out.println(name[i]);
		}
		for(String s:name)
		{
			System.out.println(s);
		}

	}

}
