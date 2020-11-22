package hospital;
import packageoOne.Date;
public class IndoorPatient extends Patient{
	private
	Patient p1=new Patient();
	int wardno, Roomno,bedno,fee;
	
	Doctor doctor;
	Date date_of_adm;
	public
	IndoorPatient()
	{
		 wardno=1;
		 Roomno=1;
		 bedno=1;
		 fee=500;
	}
	IndoorPatient(int w, int r, int b,int f)
	{
		 wardno=w;
		 Roomno=r;
		 bedno=b;
		 fee=f;
	}
	IndoorPatient(int w, int r, int b,int f,String n,String c,String a,String p,String g,String i)
	{
		 wardno=1;
		 Roomno=1;
		 bedno=1;
		 fee=500;
		 p1.setname(n);
		 p1.setcnic(c);
		 p1.setaddress(a);
		 p1.setphone_no(p);
		 p1.setgender(g);
		 p1.setage(i);
	}
	int getwardno()
	{
		return wardno;
	}
	void setwardno(int w)
	{
		wardno=w;
	}
	int getRoomno()
	{
		return Roomno;
	}
	void setRoomno(int r)
	{
		Roomno=r;
	}
	int getbedno()
	{
		return bedno;
	}
	void setbedno(int r)
	{
		bedno=r;
	}
	int getfee()
	{
		return fee;
	}
	void setfee(int r)
	{
		fee=r;
	}
	public String toString()
	{
		return "Patient's Name: "+p1.getName()+" cnic: "+p1.getCnic()+"  phone_no "+p1.getphone()+ " address: "+p1.getAddress()+" gender: "+p1.getGender()+" age "+p1.getAge()+" admit in wardno: "+getwardno()+" Roomno= "+ getRoomno()+" bedno "+getbedno()+" fee "+getfee();
	}
}

