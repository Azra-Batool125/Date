package packageoOne;
import javax.swing.JOptionPane;
public class Time {
	private String hours,mint,time;
	
	  public Time()
	  {
		  hours=" ";
		  mint=" ";
		  time=" ";
	  }
	  Time(String hours,String mint,String time)
	  {
		  this.hours=hours;
		  this.mint=mint;
		  this.time=time;
	  }
	  public   int getHour()
	  {
		  String hour=JOptionPane.showInputDialog("Enter hour:");
		  int hour1=Integer.parseInt(hour);
		  return hour1;
		  
	  }
	    void setHour(String h)
	    {
	    	hours=h;
	    }
	  public int getMint()
	  {
		  String mint=JOptionPane.showInputDialog("Enter mint:");
		  int mint1=Integer.parseInt(mint);
		  return mint1;
	  }
	  void setMint(String m)
	    {
	    	mint=m;
	    }
	  
	  public int getTime()
	  {
		  String time=JOptionPane.showInputDialog("Enter time:");
		  int time1=Integer.parseInt(time);
		  return time1;
	  }
	  void setTime(String t)
	    {
	    	time=t;
	    }
	  public String toString()
	  {
		  return  "Hour"  +getHour()+  "Mint="   +getMint()+ "Time"  +getTime() ;
	  }
	}

