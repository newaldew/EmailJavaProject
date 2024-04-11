package emailapp;

import java.util.Scanner;

public class Email {
	String FirstName;
	String LastName;
	String Password;
	int defaultPassLen=10;
	String Department;
	String mail;
	int MailBoxCapacity=500;
	String AltEmail;
	String companySuffix="XYZcompany.com";
	
	public Email(String Fname,String Lname) {
		this.FirstName=Fname;
		this.LastName=Lname;
		System.out.println("Email Created: " + this.FirstName + " " + this.LastName);
		
		this.Department=setDepartment();
		System.out.println("Department: " + this.Department);

		this.Password=randomPass(defaultPassLen);
		System.out.println("Random Password: " + Password);
		
		mail=FirstName.toLowerCase() + "." + LastName.toLowerCase() + '@' + Department + "." + companySuffix;
		System.out.println("Email ID: " + mail);
	}
	
	private String setDepartment(){
		System.out.print("Enter the department\n1 Sales\n2 Development\n3 Accounting\nEnter your choice of department: ");
		Scanner in= new Scanner(System.in);
		int x=in.nextInt();
		if(x==1) {
			return "Sales";
		}
		else if(x==2) {
			return "Development";
		}
		else if(x==3) {
			return "Accounting";
		}
		return "Nothing";
	}
	private String randomPass(int n) {
		String passList="ABEDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
		char[] password=new char[n];
		for(int i=0;i<n;i++) {
			int x=(int)(Math.random()*passList.length());
			password[i]=passList.charAt(x);
		}
		return new String(password);
	}
	public void setAltPass(String email) {
		this.mail=email;
	}
	public String getAltPass() {
		return this.mail;
	}
	public void setMailBoxCapacity(int n) {
		this.MailBoxCapacity=n;
	}
	public int getMailboxCapacity() {
		return this.MailBoxCapacity;
	}
	public void setPassword(String pass) {
		this.Password=pass;
	}
	public String getPassword() {
		return this.Password;
	}
	public void ShowIt() {
		System.out.println("Name: " + this.FirstName + this.LastName);
		System.out.println("Email ID: " + this.mail);
		System.out.println("MailBoxCapacity: " + this.MailBoxCapacity);
	}
}