package packageoOne;
public class Date {
	private
	int day;
	String month;
	int year;
	public 
	Date()
	{
		day=1;
		month="mar";
		year=2020;
	}
	Date(int day,String month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public int getDay()
	{
		return day;
	}
	void setDay(int d)
	{
		day=d;
	}
	public String getmonth()
	{
		return month;
	}
	void setDay(Date d)
	{
		day=d.day;
		month=d.month;
		year=d.year;
	}
	void setmonth(String m)
	{
		month=m;
	}
	public int getyear()
	{
		return year;
	}
	void setyear(int r)
	{
		year=r;
	}
	Date getDate(Date d)
	{
		this.day=d.day;
		this.month=d.month;
		this.year=d.year;
		return d;
	}
	public void setDate(Date d)
	{
		this.day=d.day;
		this.month=d.month;
		this.year=d.year;
	}
	
	public String toString()
	{
		return +day+"/" +month+"/"+year;
	}
}