package hospital;
import packageoOne.Date;
import packageoOne.Time;
public class OutdoorPatient extends Patient{
	private
	Patient p1=new Patient();
	Date date_of_app=new Date();
	Time time_of_app=new Time();
	Doctor doctor=new Doctor();
	int fee;
	public
	OutdoorPatient()
	{
		fee=500;
	}
	OutdoorPatient(int f)
	{
		fee=f;
	}
	OutdoorPatient(int f,Date d,Time t,String n,String c,String a,String p,String g,String i)
	{
		fee=f;
		date_of_app.setDate(d);
		p1.setname(n);
		p1.setcnic(c);
		p1.setaddress(a);
		p1.setphone_no(p);
		p1.setgender(g);
		p1.setage(i);
	}
	int getfee()
	{
		return fee;
	}
	void setfee(int r)
	{
		fee=r;
	}
	public void addODPatient()
	{
		addPatient();
		getfee();
	}

	public String toString()
	{
		return "Patient's Name: "+p1.getName()+" cnic: "+p1.getCnic()+"  phone_no "+p1.getphone()+ " address: "+p1.getAddress()+" gender: "+p1.getGender()+" age "+p1.getAge()+"  date_of_appointment= "+ date_of_app.getDay()+"/"+date_of_app.getmonth()+"/"+ date_of_app.getmonth()+" time_of_appointment "+time_of_app.getHour()+" : "+time_of_app.getMint()+ " : "+time_of_app.getTime()+" Doctor's Name: "+doctor.getName()+" Departmant: " +doctor.getDepartment()+" Specialization "+doctor.getSpecialization()+" cnic: "+doctor.getCnic()+" phone_no "+doctor.getphone()+ " gender: "+doctor.getGender()+" fee "+fee;
	}
}