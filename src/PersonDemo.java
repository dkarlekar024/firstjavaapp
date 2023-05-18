
public class PersonDemo {
	public static void main(String[] args) 
	{
			// TODO Auto-generated method stub
			
			Person p1 = new Person("Seeta",3,4,2000);
			p1.Display();
			
			Person p2 = new Person("Geeta", new Date(1,1,2000));
			System.out.println(p2.show());
			

		}

}
