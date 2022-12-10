
public class ArrayWithIfElseBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr = {1,2,3,5,8,11,12,13,14};
		
		//check if array has multiple of 2
		
		for(int i=0; i< arr.length; i++)
		{
			if(arr[i] % 2==0)
			{
				System.out.println(arr[i]);
			}
			else
			{
				System.out.println(arr[i]+" is not multiple of 2");
			}
		}

	}

}
