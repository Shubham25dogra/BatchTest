
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The Data which we written below outside of middle bracket that Run by some stances
				MethodsDemo d = new MethodsDemo();
				d.getData();
				String name = d.getData1();
				System.out.println(name);
				getData2();
				String NAME = getData2();
				System.out.println(NAME);
				// the Data we can also use from other class see below
				
				//Practiceclass a = new Practiceclass();
				//String name1 = a.Stance();
				//System.out.println(name1);
			}
			
		    // We Can't Run it From Here, The Data always Run Under Above Middle Brackets
			public void getData()
			{
				System.out.println("Great Job With Great Work");
			}
			// if we Consider Return than there it show error because above we consider void to replace this error then see below
			public String getData1()
			{
				System.out.println("Create a Hello World");
				return "Shubham Dogra";
				// here you see that after typing return it replace void to String
			}
			public static String getData2()
			{
				System.out.println("Create a Hello World as a stance");
				return "Shubham Dogra";
				// If we use static then it behave as a command,if you go above then you should only type name that we given above
			}

}
