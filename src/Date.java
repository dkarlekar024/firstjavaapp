

class Date {
private int day,month,year;
	
	public Date() 
	{
		day = month = year = 0;
		
	}
	
	public Date(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String toString()
	{
		return "\t" + day + "\t" + month + "\t" + year;
	}
}
	
	
