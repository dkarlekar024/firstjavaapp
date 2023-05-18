
public class Person {

	{
		
		private String name;
		private Date dob;
		
		public Person()
		{
			
		}

		public Person(String name, Date d1)
		{
			this.name = name;
			this.dob = d1;
		}
		
		public Person(String name , int d , int m , int y)
		{
			this.name = name;
			dob = new Date(d,m,y);
		}
		
		public String show()
		{
			String str = dob.show();
			return  "\t" +name + "\t" + str;
		}
		
		public void Display()
		{
			System.out.println("Name -  "+ name);
			dob.display();
		}
		
	}
		
		
		

}
