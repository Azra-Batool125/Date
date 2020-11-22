package hospital;
import javax.swing.JOptionPane;

public class Doctor {
          private  String name, cnic, phone_no, gender, department, specialization;
          Doctor()
          {
        	  name=" ";
        	  cnic=" ";
        	  phone_no=" ";
        	  gender=" ";
        	  department=" ";
        	  specialization=" ";
          }
          Doctor(String name,String cnic, String phone_no, String gender, String department,String  specialization)
          {
        	  this.name=name;
        	  this.cnic=cnic;
        	  this.phone_no=phone_no;
        	  this.gender=gender;
        	  this.department=department;
        	  this.specialization=specialization;
          }
       String getName() 
          {
        	  String Name=JOptionPane.showInputDialog("Enter name:");
        	  return Name;
          }
   void setName(String n)
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
     int getphone()
          {
        	  String phone_no=JOptionPane.showInputDialog("Enter phoneNumber:");
    		  int phone_no1=Integer.parseInt(phone_no);
    		  return phone_no1;
          }
     void setphone_no(String p)
      	{
      		phone_no=p;
      	}
      String getGender() 
          {
        	  String Gender=JOptionPane.showInputDialog("Enter Gender:");
        	  return Gender;
          }
      void setgender(String g)
      	{
      		gender=g;
      	}
       String getDepartment()
          {
        	  String Department=JOptionPane.showInputDialog("Enter Department:");
        	  return Department;
          }
        void setDepartment(String d)
      	{
      		department=d;
      	}
       String getSpecialization()
          {
        	  String Specialization=JOptionPane.showInputDialog("Enter Specialization:");
        	  return Specialization;
          }
       void setSpecialization(String s)
      	{
      		specialization=s;
      	}
       public  Doctor getDoctorInfo(Doctor doc)
      	{
      		this.name=doc.name;
      		this.cnic=doc.cnic;
      		this.phone_no=doc.phone_no;
      		this.gender=doc.gender;
      		this.department=doc.department;
      		this.specialization=doc.specialization;
      		return doc;
      	}
      	public  void addDoctor()
      	{
      		getName();
      		getCnic();
      		getphone();
      		getGender() ;
      		getDepartment();
      		getSpecialization();
      	}

       public String toString()
   	{
   		return "Doctor's Name: "+getName()+" Departmant: " +getDepartment()+" Specialization "+getSpecialization()+" cnic: "+getCnic()+" phone_no "+getphone()+ " gender: "+getGender();
   	}
          
}
