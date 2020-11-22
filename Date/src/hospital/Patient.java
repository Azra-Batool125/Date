package hospital;
import javax.swing.JOptionPane;
public class Patient {
	private
	String name;
	String cnic;
	String address; 
	String phone_no;
	String gender;
	String age;
	public
	Patient()
	{
		name=" ";
		cnic="37405-5463806-2";
		address= "E/173/A, N/P, S/town,Rwp."; 
		phone_no= "0349-1202428";
		gender=" ";
		age=" ";
	}
	Patient(String n,String c,String a,String p,String g,String ag)
	{
		name=n;
		cnic=c;
		address= a; 
		phone_no= p;
		gender=g;
		age=ag;
	}
	  String getName() 
      {
    	  String Name=JOptionPane.showInputDialog("Enter name:");
    	  return Name;
      }
	void setname(String n)
	{
		name=n;
	}
	int getCnic()
    {
  	  String cnic=JOptionPane.showInputDialog("Enter cnic: ");
		  int cnic1=Integer.parseInt(cnic);
		  return cnic1;
    }
	void setcnic(String c)
	{
		cnic=c;
	}
	 String getAddress() 
     {
   	  String Address=JOptionPane.showInputDialog("Enter address:");
   	  return Address;
     }
	void setaddress(String a)
	{
		address=a;
	}
	 int getphone()
     {
   	  String phone_no=JOptionPane.showInputDialog("Enter phoneNumber:");
		  int phone_no1=Integer.parseInt(phone_no);
		  return phone_no1;
     }
	void setphone_no(String r)
	{
		phone_no=r;
	}
	String getGender() 
    {
  	  String Gender=JOptionPane.showInputDialog("Enter Gender:");
  	  return Gender;
    }
	void setgender(String r)
	{
		gender=r;
	}
	 int getAge()
     {
   	  String phone_no=JOptionPane.showInputDialog("Enter age:");
		  int age1=Integer.parseInt(age);
		  return age1;
     }
	void setage(String r)
	{
		age=r;
	}
	public  void addPatient()
   	{
		getName();
		getCnic();
		getAddress();
		getphone();
		getGender();
		getAge();
   	}
	public  Patient getPatientInfo(Patient p)
   	{
   		this.name=p.name;
   		this.cnic=p.cnic;
   		this.address=p.address;
   		this.phone_no=p.phone_no;
   		this.gender=p.gender;
   		this.age =p.age;
   		return p;
   	}

	public String toString()
	{
		return "Patient's Name: "+getName() +" cnic: "+getCnic()+"  phone_no "+getphone()+ " address: "+getAddress()+" gender: "+getGender() +" age "+getAge();
	}
}